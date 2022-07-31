package main;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import coaches.Coach;
import coaches.CricketCoach;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//ITt azért kell a coach helyett a cricketCoach, mert a getTEam és a getEmail a CricketCoach-ban van definiálva, és nem a coachban
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getTeam());
		System.out.println(cricketCoach.getEmail());
		
		System.out.println("-----------------------------------------");
		
		Coach footballCoach = context.getBean("myFootballCoach", Coach.class);
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
