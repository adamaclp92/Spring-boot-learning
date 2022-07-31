package com.adam.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach footBallCoach = context.getBean("footBallCoach", Coach.class);
		
		System.out.println(footBallCoach.getDailyWorkout());
		System.out.println(footBallCoach.getDailyFortune());

	}

}
