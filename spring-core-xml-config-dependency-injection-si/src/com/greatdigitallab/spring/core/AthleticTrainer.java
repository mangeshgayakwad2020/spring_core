package com.greatdigitallab.spring.core;

public class AthleticTrainer implements Trainer {
	
	// create private giftService
	private GiftService giftService;
	
	// create setter for gift service
	public void setGiftService(GiftService giftService) {
		System.out.println("AthleticTrainer: inside method - setGiftService");
		this.giftService = giftService;
	}

	@Override
	public String getTodaysTraining() {
		// TODO Auto-generated method stub
		return "Run hard for 10KM";
	}

	@Override
	public String getTodaysGift() {
		// TODO Auto-generated method stub
		return giftService.getTodaysGift();
	}

}
