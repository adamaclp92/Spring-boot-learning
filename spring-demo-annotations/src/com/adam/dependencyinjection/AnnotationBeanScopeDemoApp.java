package com.adam.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach oneCoach = context.getBean("tennis", Coach.class);
        Coach twoCoach = context.getBean("tennis", Coach.class);

        //System.out.println(oneCoach.getDailyWorkout());
        //System.out.println(oneCoach.getDailyFortune());

        boolean result = (oneCoach == twoCoach);
        System.out.println("Ugyanarra az object-re mutat? " + result);
        System.out.println("Memory location: " + oneCoach);
        System.out.println("Memory location: " + twoCoach);

        System.out.println(oneCoach.getDailyFortune());

        context.close();

    }
}
