package com.greatdigitallab.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimTrainer implements Trainer {

	private GiftService giftService;
	
	// create a no-arg constructor
	public SwimTrainer() {
		System.out.println("SwimTrainer: inside no-arg constructor");
	}
	
	// configure the Qualifier with the bean id inside constructor arguments
	@Autowired
	public SwimTrainer(@Qualifier("scrachCardGiftService") GiftService giftService) {
		System.out.println("SwimTrainer: inside constructor with @Qualifier");
		this.giftService = giftService;
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
