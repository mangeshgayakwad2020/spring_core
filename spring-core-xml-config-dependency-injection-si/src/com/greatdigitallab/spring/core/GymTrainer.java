package com.greatdigitallab.spring.core;

public class GymTrainer implements Trainer {

	// create private gift service for Gym Trainer
	private GiftService giftService;

	// create constructor for gift service
	public GymTrainer(GiftService giftService) {
		this.giftService = giftService;
	}
	
	@Override
	public String getTodaysTraining() {
		return "Today, Go for 6 sets of Bench Press";
	}

	@Override
	public String getTodaysGift() {
		// TODO Auto-generated method stub
		return giftService.getTodaysGift();
	}

}
