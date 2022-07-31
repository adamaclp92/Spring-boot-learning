package com.adam.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach{

	//Field injection  -- Ezt fogom használni, mindegy, hogy a setter, constructor, vagy field injectiont használjuk, de legyünk konzisztensek
	//1. HappyFortuneService Osztály @Component hozzáadása
	//2. Ebben az osztályban létrehozni egy új FortuneServices típusú fieldet
	//3. @Autowired hozzá
	//4. Hogyha több olyan osztály van, ami implementálja a FortuneServices interfészt, akkor
	//@Qualifier(osztálynév) - és akkor az lesz használva
	//Ha egy másik

	@Autowired
	@Qualifier("randomka")
	private FortuneServices fortuneService;
	
	//Constructor injection
	/*@Autowired
	public FootBallCoach(FortuneServices theFortuneService){
		fortuneService = theFortuneService;
	}*/
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	//Setter injection
	/*@Autowired
	public void setFortuneService(FortuneServices fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	//Method injection
	/*@Autowired
	public void doStuff(FortuneServices fortuneServices) {
		System.out.println("dostuff");
		this.fortuneService = fortuneServices;
	}*/

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getDailyFortune();
	}

}
