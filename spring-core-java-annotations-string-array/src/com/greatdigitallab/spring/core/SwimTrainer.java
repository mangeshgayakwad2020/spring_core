package com.greatdigitallab.spring.core;

import org.springframework.stereotype.Component;

@Component
public class SwimTrainer implements Trainer {

	private String[] data = {"one",  "two", "three", "four", "five"};
	
	@Override
	public String getTodaysTraining() {
		return "Today, Swim 1000 meter in the pool";
	}

	// create method to display all String array elements
	public void displayData() {
		for(String str : data) {
			System.out.println(str);
		}
	}
}
