package com.adam.noxmlconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class SquashFortuneService implements FortuneServices{

    ArrayList<String> fortunes = new ArrayList<>();
    Random rnd = new Random();

    @PostConstruct
    public void initMethod(){
        System.out.println("Hello, ez itt a squasholók ligája.");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Adam\\eclipse-workspace\\spring-demo-annotations\\src\\com\\adam\\noxmlconfig\\fortunes.txt"));
            String s;
            while((s = reader.readLine()) != null){
                fortunes.add(s);
                System.out.println("Hozzáadva: " + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("viszlát");
    }

    @Override
    public String getDailyFortune() {
        return fortunes.get(rnd.nextInt(fortunes.size()));
    }
}
