package com.greatdigitallab.spring.core;

import org.springframework.stereotype.Component;

@Component
public class WatchGiftService implements GiftService {

	@Override
	public String getGiftService() {
		return "Congratulations! you are gifted with Watch";
	}

}
