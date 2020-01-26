package com.mihingo.springannt.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mihingo.springannt.practice.Coach;

@Component
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("randomFileFortuneService")
	private	FortuneService fortuneService;
	
	public SwimCoach() {
		System.out.println("Inside SwimCoach main Constructor");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice swimming backstroke";
	}

	@Override
	public String getDailyFortune() {
		
			return fortuneService.getFortuneService();
	}

}
