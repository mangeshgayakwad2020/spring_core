package com.greatdigitallab.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from Spring Container
		AthleticTrainer myTodaysTrainer = context.getBean("myAthleticTrainer", AthleticTrainer.class);
		
		// Call methods on the bean
		System.out.println(myTodaysTrainer.getTodaysTraining());
		
		// Call the newly added gift service method
		System.out.println(myTodaysTrainer.getTodaysGift());
		
		// Call the newly added methods for literal injections
		System.out.println(myTodaysTrainer.getName());
		System.out.println(myTodaysTrainer.getEmailAddress());
		
		// Close the context
		context.close();
	}

}