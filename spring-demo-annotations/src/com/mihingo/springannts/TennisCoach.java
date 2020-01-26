package com.mihingo.springannts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("randomFortuneService") */
	 FortuneService fortuneService;
	 

	public TennisCoach() {
		System.out.println(">> Inside no-args constructor");
	}

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */

	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {

		System.out.println(">> TennisCoach: Inside the setter autowired");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "<<getDailyWorkout>> Hello there tennis player!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
