package com.adam.noxmlconfig;

import org.springframework.beans.factory.annotation.Value;

public class SquashCoach implements Coach{

    private FortuneServices fortuneServices;

    public SquashCoach(FortuneServices fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    @Value("${foo.jatekosneve}")
    private String name;

    @Value("${foo.jatekosmezszam}")
    private String mezszam;

    @Override
    public String getDailyWorkout() {
        return "Nagyon squashozok";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServices.getDailyFortune();
    }

    public String getName() {
        return name;
    }

    public String getMezszam() {
        return mezszam;
    }
}
