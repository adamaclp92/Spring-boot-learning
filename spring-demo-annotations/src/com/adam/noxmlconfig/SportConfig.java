package com.adam.noxmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.adam.noxmlconfig")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    //define bean for our sad fortune service
    @Bean
    public FortuneServices sadFortuneService(){
        return new SadFortuneService();
    }

    //define bean for our swim coanch and injext dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

    @Bean
    public FortuneServices SquashFortuneService(){
        return new SquashFortuneService();
    }

    @Bean
    public Coach squashCoach(){
        return new SquashCoach(SquashFortuneService());
    }
}
