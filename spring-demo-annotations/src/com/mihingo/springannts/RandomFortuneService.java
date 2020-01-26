package com.mihingo.springannts;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String data[]= {
			"Random 1",
			"Random 2",
			"Random 3",
			"Random 4"
	};
	
	

	public static void jsonObject() {
		String api_url = "http://quotes.rest/qod/categories";
		
		try {
			URL url = new URL(api_url);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setRequestProperty("Content-Type", "application/json; charset-utf-8");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setRequestMethod("POST");
			
//			OutputStream os = conn.getOutputStream();
//			os.write(json.getBytes("UTF-8"));
//			os.close();
			
			InputStream in = new BufferedInputStream(conn.getInputStream());
			String result = org.apache.commons.io.IOUtils.toString(in,"UTF-8");
			
			System.out.println(result);
			
			in.close();
			conn.disconnect();
			
			
		} catch (Exception e) {
			System.out.println("An error occurred " +e);
		}
	}
	private Random myRandom = new Random();
	@Override
	public String getFortuneService() {
		int index = myRandom.nextInt(data.length);
		
		String fortune=data[index];
		
		jsonObject();
		
		return ">> Inside Random Fortune Service " + fortune;
	}

}
