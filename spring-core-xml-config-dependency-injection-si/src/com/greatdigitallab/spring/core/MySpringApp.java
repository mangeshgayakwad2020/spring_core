package com.greatdigitallab.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from Spring Container
		Trainer myTodaysTrainer = context.getBean("myAthleticTrainer", Trainer.class);
		
		// Call methods on the bean
		System.out.println(myTodaysTrainer.getTodaysTraining());
		
		// Call the newly added gift service method
		System.out.println(myTodaysTrainer.getTodaysGift());
		
		// Close the context
		context.close();
	}

}