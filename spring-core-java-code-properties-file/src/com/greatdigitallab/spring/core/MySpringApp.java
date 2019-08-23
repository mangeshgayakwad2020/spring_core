package com.greatdigitallab.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {

		// Load the Spring Configuration using Java code
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from Spring Container
		SwimTrainer myTodaysTrainer = context.getBean("swimTrainer", SwimTrainer.class);
		
		// Call methods on the bean
		System.out.println(myTodaysTrainer.getTodaysTraining());
		
		// Call the newly added getter methods
		System.out.println("Name : " + myTodaysTrainer.getName());
		System.out.println("Email : " + myTodaysTrainer.getEmail());
		
		// Close the context
		context.close();
	}

}
