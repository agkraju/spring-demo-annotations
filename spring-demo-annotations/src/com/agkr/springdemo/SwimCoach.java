package com.agkr.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneservice;
	
	@Value("${foo.age}")
	int age;
	
	@Value("${foo.name}")
	String name;
	
	public SwimCoach(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 meter as a warm up";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
