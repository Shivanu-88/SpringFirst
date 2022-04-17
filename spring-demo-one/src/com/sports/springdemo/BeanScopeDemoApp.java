package com.sports.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check to see if they are same
		
		boolean result = (theCoach == alphaCoach);
		
		//print out results
		
		System.out.println("\nPointing to same object: " + result);
		System.out.println("\nMemory location for the theCoach: " + theCoach);
		System.out.println("\nMemory location for the alphaCoach: " + alphaCoach + "\n");
		
		//close the context
		context.close();
		

	}

}
