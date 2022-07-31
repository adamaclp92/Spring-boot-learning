package com.adam.dependencyinjection;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Component
public class HappyFortuneService implements FortuneServices{

	private ArrayList<String> fortunes = new ArrayList<String>();

	private String c = null;

	Random rnd = new Random();

	@Override
	public String getDailyFortune() {
		return fortunes.get(rnd.nextInt(fortunes.size()));
	}


	//Define my init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("Elkezdem a tennis coachot.");

		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Adam\\eclipse-workspace\\spring-demo-annotations\\src\\com\\adam\\dependencyinjection\\fortunes.txt")))
		{
			while((c = reader.readLine()) != null){
				fortunes.add(c);
				System.out.println("Hozzáadva a fortune: " + c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//Define my destroy method
	@PreDestroy
	public void doMyDestroyStuff(){
		System.out.println("Befejezem a tennis coachot");
	}

}
