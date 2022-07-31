package main;

import coaches.BaseballCoach;
import coaches.Coach;
import services.FortuneServices;
import services.HappyFortuneService;

public class MyApp {
	public static void main(String[] args) {
		
		
		Coach coach = new BaseballCoach(new HappyFortuneService());
		System.out.println(coach.getDailyWorkout());
		//System.out.println(coach.getDailyFortune());
	}
}
