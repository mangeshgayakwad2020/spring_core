package com.greatdigitallab.spring.core;

public class AthleticTrainer implements Trainer {
	
	// create private giftService
	private GiftService giftService;
	
	// add private fields to create the literal injection
	private String name;
	private String emailAddress;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("AthleticTrainer: inside setter method - setName");
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("AthleticTrainer: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	// create setter for gift service
	public void setGiftService(GiftService giftService) {
		System.out.println("AthleticTrainer: inside setter method - setGiftService");
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
