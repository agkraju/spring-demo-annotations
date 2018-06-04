package com.agkr.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from spring container
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		//TennisCoach tCoach = (TennisCoach) coach;
		
		// Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getName());
		
		System.out.println(coach.getAge());
		
		// Close context  
		
		context.close();
	}

}
