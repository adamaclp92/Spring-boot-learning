package com.adam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballCoachApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach footballCoach = context.getBean("footballCoach", Coach.class);
		System.out.println(footballCoach.getDailyWorkout());

	}

}
