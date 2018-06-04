package com.agkr.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.agkr.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// Define bean for SadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Define bean for SwimCoach and inject dependency
	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		return new SwimCoach(fortuneService);
	}

}
