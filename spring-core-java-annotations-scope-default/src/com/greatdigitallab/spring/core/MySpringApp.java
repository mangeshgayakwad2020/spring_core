package com.greatdigitallab.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the first bean from Spring Container
		Trainer myFirstTrainer = context.getBean("swimTrainer", Trainer.class);
		
		// Get the second bean from Spring Container
		Trainer mySecondTrainer = context.getBean("swimTrainer", Trainer.class);
		
		// check if both the beans are same
		boolean result = (myFirstTrainer==mySecondTrainer);
		
		// Display the output
		System.out.println("Both Beans are pointing to the same object : " + result);
		System.out.println("Memory location for myFirstTrainer : " + myFirstTrainer);
		System.out.println("Memory location for mySecondTrainer : " + mySecondTrainer);
		
		// Close the context
		context.close();
	}

}
