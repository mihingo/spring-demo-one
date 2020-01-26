package com.mihingo.springannts;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from the spring container
		//Coach tennisCoach  = context.getBean("tennisCoach", Coach.class);
		FootballCoach fooCoach = context.getBean("footballCoach",FootballCoach.class);
		
		//call a method on the bean
		//System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(fooCoach.getDailyWorkout());
		
				
		//System.out.println(tennisCoach.getDailyFortune());
		System.out.println(fooCoach.getDailyFortune());
		System.out.println(fooCoach.getEmail());
		//close the context
		
		context.close();
	}

}
