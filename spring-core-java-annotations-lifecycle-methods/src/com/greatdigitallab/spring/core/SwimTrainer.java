package com.greatdigitallab.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimTrainer implements Trainer {

	private GiftService giftService;
	
	public SwimTrainer() {
		System.out.println("SwimTrainer: inside no-arg constructor");
	}

	@Autowired
	public SwimTrainer(GiftService giftService) {
		System.out.println("SwimTrainer: inside GiftService argument constructor");
		this.giftService = giftService;
	}
	
	// define the init method
	@PostConstruct
	public void doStartupTasks() {
		System.out.println("SwimTrainer: inside the doStartupTasks() method");
	}
	
	// define the destroy method
	@PreDestroy
	public void doCleanupTasks() {
		System.out.println("SwimTrainer: inside the doCleanupTasks() method");
	}
	
	@Override
	public String getTodaysTraining() {
		return "Today, Swim 1000 meter in the pool";
	}

	@Override
	public String getGiftService() {
		// TODO Auto-generated method stub
		return giftService.getGiftService();
	}

}
