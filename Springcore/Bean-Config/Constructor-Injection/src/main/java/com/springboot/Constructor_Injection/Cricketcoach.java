package com.springboot.Constructor_Injection;

import org.springframework.stereotype.Component;
import com.springboot.Constructor_Injection.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Cricketcoach implements Coach {
    public Cricketcoach(){
        System.out.println("In Constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return "PRACTICE FAST BOWLING TO WIN THE MATCH";
    }

    
}
