package com.agkr.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneservice;
	
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

}
