package com.greatdigitallab.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimTrainer implements Trainer {

	@Autowired
	@Qualifier("scrachCardGiftService")
	private GiftService giftService;

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
