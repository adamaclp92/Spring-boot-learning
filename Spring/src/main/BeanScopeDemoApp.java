package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import coaches.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring coniguration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//boolean result = (theCoach == alphaCoach);
		
		//System.out.println("A két bean ugyanaz: " + result);
		System.out.println("Memory location for theCoach " + theCoach);
		//System.out.println("Memory location for alphaCoach " + alphaCoach);
		
		//Ha az application context-ben be van állítva a scope prototype-nak, onnantól kezdve két külön beanként lesz deklarálva
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		//ha a scope prototype, akkor a destroy-method nem fut le!!!
		//csak akkor ha az osztálynál implementáltuk a DisposableBean interfészt
		context.close();

	}

}
