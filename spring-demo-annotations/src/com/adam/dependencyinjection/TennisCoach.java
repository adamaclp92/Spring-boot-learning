package com.adam.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@Component("tennis")
//@Scope("prototype")  --ezzel tudom elérni, hogy minden egyes getBean-re új instance jöjjön létre
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneServices fortuneServices;



    @Override
    public String getDailyWorkout() {
        return "teniszezek";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneServices.getDailyFortune();
    }


}
