package com.mihingo.springannts;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "REST Fortune Service";
	}

}
