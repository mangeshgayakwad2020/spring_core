package com.greatdigitallab.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from Spring Container
		SwimTrainer mySwimTrainer = context.getBean("swimTrainer", SwimTrainer.class);
		
		// Call methods on the bean
		System.out.println(mySwimTrainer.getTodaysTraining());
		
		// Call the getter methods
		System.out.println(mySwimTrainer.getName());
		System.out.println(mySwimTrainer.getEmail());
		
		// Close the context
		context.close();
	}

}
