package com.mihingo.springannts;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {

		return "Happy fortune service autowired via constructor";
	}

}
