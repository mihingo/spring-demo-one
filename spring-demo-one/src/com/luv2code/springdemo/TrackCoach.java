package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Track Coach: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Bean Init");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: Bean Destroy");
	}

}
