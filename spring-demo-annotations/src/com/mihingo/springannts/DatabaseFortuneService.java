package com.mihingo.springannts;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return ">>Database Fortune Service";
	}

}
