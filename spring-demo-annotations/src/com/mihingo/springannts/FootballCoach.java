package com.mihingo.springannts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.username}")
	private String username;
	@Value("${foo.password}")
	private String password;

	public FootballCoach() {
		System.out.println(">>Inside default football coach constructor");
	}

	@Autowired
	public FootballCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		System.out.println(">>Inside Football constructor with Injected fortune service");
		System.out.println("My email is " + email + " and username is "+username+" and password is "+password);
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Hi there football player!";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	
	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	

}
