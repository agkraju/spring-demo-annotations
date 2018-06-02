package com.agkr.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("com.agkr.springdemo")
public class SportConfig {
	
	// Define bean for SadFortuneService
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Define bean for SwimCoach and inject dependency
	public Coach swimCoach(FortuneService fortuneService) {
		return new SwimCoach(fortuneService);
	}

}
