package com.adam.dependencyinjection;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomka")
public class RandomService implements FortuneServices{

    private String[] data = {
            "Hajrá hajrá",
            "Ügyes leszel",
            "Kitartást"
    };

    private Random rnd = new Random();

    @Override
    public String getDailyFortune() {
        return data[rnd.nextInt(data.length)];
    }
}
