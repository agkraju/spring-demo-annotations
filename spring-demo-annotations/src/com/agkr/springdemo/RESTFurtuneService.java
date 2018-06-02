package com.agkr.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFurtuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "REST Furtune";
	}

}
