package com.agkr.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFurtuneService implements FortuneService {

	String[] names = {"Gopi", "Ramu", "Satya"};
	@Override
	public String getFortune() {
		// Get Random string from array
		Random random = new Random();
		int index = random.nextInt(names.length);

		return names[index];
	}

}
