package com.mihingo.springannt.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationPracticeApp {

	public static void main(String[] args) {
		System.out.println("Hi There");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		Coach swimCoach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(swimCoach.getDailyFortune());
		
		System.out.println(swimCoach.getDailyWorkout());
		
		context.close();
	}

}
