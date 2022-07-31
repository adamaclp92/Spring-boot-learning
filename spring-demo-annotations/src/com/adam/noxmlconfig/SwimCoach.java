package com.adam.noxmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach{

    private FortuneServices fortuneServices;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.name}")
    private String name;


    public SwimCoach(FortuneServices fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    @Override
    public String getDailyWorkout() {
        return "Swimming";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServices.getDailyFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
