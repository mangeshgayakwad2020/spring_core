package com.greatdigitallab.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimTrainer implements Trainer {

	private GiftService giftService;
	
	@Autowired
	public void setGiftService(GiftService giftService) {
		System.out.println("SwimTrainer : Inside the setGiftService() method");
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
