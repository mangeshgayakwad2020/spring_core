package com.greatdigitallab.spring.core;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ScrachCardGiftService implements GiftService {

	// create a String array of gifts
	private String[] gifts = {
			"Congratulations! You got a super cool T-Shirt",
			"Congratulations! You got a Gems",
			"Congratulations! You got a super cool movie ticket",
			"Congratulations! You got a Air ticket",
	};
	
	// Random class is to generate a random number
	private Random random = new Random();
	
	@Override
	public String getGiftService() {
		
		// get the number randomly starting from 0 to (gifts.length - 1)
		int index = random.nextInt(gifts.length);
		
		return gifts[index];
	}

}
