package com.agkr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// Close context
		context.close();
	}

}
