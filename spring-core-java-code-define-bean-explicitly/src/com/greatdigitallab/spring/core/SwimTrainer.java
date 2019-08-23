package com.greatdigitallab.spring.core;

public class SwimTrainer implements Trainer {

	private GiftService giftService;
	
	// create a constructor to set the gift service
	public SwimTrainer(GiftService giftService) {
		this.giftService = giftService;
	}

	@Override
	public String getTodaysTraining() {
		return "Today, Swim 1000 meter in the pool";
	}

	@Override
	public String getGiftService() {
		return giftService.getGiftService();
	}

}
