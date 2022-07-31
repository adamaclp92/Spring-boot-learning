package com.adam.springdemo;

import org.springframework.stereotype.Component;

//Adhatunk meg explicit módon Bean ID-t, de ha nem adunk meg, akkor az lesz a default bean id, ami az osztály neve, csak kis kezdõbetûvel
//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	

}
