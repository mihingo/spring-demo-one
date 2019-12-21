package com.luv2code.springdemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;

	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Golf:- Practice golfing 10 minutes fast";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
