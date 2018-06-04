package com.agkr.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("tennisCoach")

//@Scope("prototype")
@Component
public class TennisCoach implements Coach {

	//@Autowired
	//@Qualifier("randomFurtuneService")
	private FortuneService fortuneService;
	
	//@Autowired
	//private RESTFurtuneService RESTFurtuneService;
	
	// Field injection
	@Value("10")
	int n;
	
	// Constructor injection
	@Autowired
	public TennisCoach(@Qualifier("randomFurtuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TennisCoach() {
		super();
		System.out.println("Default Contructor");
	}

	// Setter injection
	/*
	 @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter Injection");
		this.fortuneService = fortuneService;
	}
	*/
	
	// init method
	@PostConstruct
	public void doInitStuff() {
		System.out.println("Init method");
	}
	
	// destroy method
	@PreDestroy
	public void doDestroyStuff() {
		System.out.println("Destroy method");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice 2 hours";

	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
