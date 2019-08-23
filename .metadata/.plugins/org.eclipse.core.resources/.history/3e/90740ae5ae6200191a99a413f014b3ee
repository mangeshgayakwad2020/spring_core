package com.greatdigitallab.spring.core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SwimTrainer implements Trainer {

	// create a no-arg constructor to track the workflow
	public SwimTrainer() {
		System.out.println("SwimTrainer: inside no-arg constructor");
	}

	@Override
	public String getTodaysTraining() {
		return "Today, Swim 1000 meter in the pool";
	}

}
