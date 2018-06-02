package com.agkr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
		// Retrieve bean from spring container
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		Coach betaCoach = context.getBean("tennisCoach", Coach.class);
		
		// Call methods on the bean
		boolean result = (alphaCoach == betaCoach);
		
		System.out.println("alphaCoach and betaCoach pointing to same object : " + result);	
		System.out.println("Memory location of alphaCoach : " + alphaCoach);
		System.out.println("Memory location of bataCoach : " + betaCoach);
		
		// Close context
		context.close(); 

	}

}
