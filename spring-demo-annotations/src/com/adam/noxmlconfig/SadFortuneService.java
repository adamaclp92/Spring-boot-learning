package com.adam.noxmlconfig;

public class SadFortuneService implements FortuneServices{
    @Override
    public String getDailyFortune() {
        return "today is a sad day";
    }
}
