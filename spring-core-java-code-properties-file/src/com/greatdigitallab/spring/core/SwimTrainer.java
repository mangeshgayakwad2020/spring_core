package com.greatdigitallab.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimTrainer implements Trainer {

	@Value("${trainer.name}")
	private String name;
	
	@Value("${trainer.email}")
	private String email;
	
	@Override
	public String getTodaysTraining() {
		return "Today, Swim 1000 meter in the pool";
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
}
