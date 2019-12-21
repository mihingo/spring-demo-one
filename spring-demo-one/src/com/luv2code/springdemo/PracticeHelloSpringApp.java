package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach golfCoach = context.getBean("myGolfCoach", Coach.class);
		// call methods on the bean
		System.out.println(golfCoach.getDailyFortune());
		System.out.println(golfCoach.getDailyWorkout());
		// close the context
		context.close();

	}

}
