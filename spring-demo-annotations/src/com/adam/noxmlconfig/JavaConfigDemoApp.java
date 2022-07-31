package com.adam.noxmlconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);


        Coach oneCoach = context.getBean("tennis", Coach.class);
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(oneCoach.getDailyFortune());
        System.out.println(oneCoach.getDailyWorkout());

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        System.out.println(swimCoach.getEmail() + swimCoach.getName());

        context.close();

    }
}
