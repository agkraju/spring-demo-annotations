package com.agkr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		//TennisCoach tCoach = (TennisCoach) coach;
		
		// Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		//System.out.println(tCoach.getN());
		
		// Close context  
		
		context.close();
	}

}
