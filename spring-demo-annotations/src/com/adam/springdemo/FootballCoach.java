package com.adam.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
	
	private List<String> workouts;
	

	public FootballCoach() {
		this.workouts = new ArrayList<String>();
		
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\Adam\\eclipse-workspace\\spring-demo-annotations\\src\\com\\adam\\springdemo\\trainings.txt")))
		{
 
				while(reader.readLine() != null) {
					workouts.add(reader.readLine());
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public String getDailyWorkout() {
		Random rnd = new Random();
		return workouts.get(rnd.nextInt(workouts.size()));
		
	}

}
