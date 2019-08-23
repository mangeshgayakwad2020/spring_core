package com.greatdigitallab.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the first bean from Spring Container
		Trainer myTrainer = context.getBean("myDefaultTrainer", Trainer.class);
		
		// Call the method of the bean
		System.out.println(myTrainer.getTodaysTraining());
		System.out.println(myTrainer.getTodaysGift());

		// Close the context
		context.close();
	}

}