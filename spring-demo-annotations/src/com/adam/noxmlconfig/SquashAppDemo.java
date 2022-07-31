package com.adam.noxmlconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SquashAppDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SquashCoach coach = context.getBean(SquashCoach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getMezszam());
        System.out.println(coach.getName());

        context.close();
    }
}
