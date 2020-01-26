package com.mihingo.springannt.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFileFortuneService implements FortuneService {
	private String fileName = "C:\\Users\\user\\git\\repository\\spring-demo-annotations\\src\\randomFortunes.properties";
	private List<String> theFortuneArr;
	
	private Random myRandom = new Random();
	
	public RandomFileFortuneService() throws FileNotFoundException {
		File theFile = new File(fileName);
		System.out.println("Reading fortunes from the file: " +theFile);
		System.out.println("File exists: "+theFile.exists());
		System.out.println("File space: "+theFile.getFreeSpace());
		
		theFortuneArr = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(theFile));
		String tempLine;
		while ((tempLine=br.readLine())!=null) {
			
			theFortuneArr.add(tempLine);
			
		}
			br.close();
		} catch (IOException e) {
			System.out.println("MSG DEV: An error occurred "+e);
			e.printStackTrace();
		}
		
		
	}

	@Override
	public String getFortuneService() {		
		int index = myRandom.nextInt(theFortuneArr.size());
		String randFortune = theFortuneArr.get(index);
		
		return randFortune;
	}

}
