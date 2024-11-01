package com.springboot.Constructor_Injection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach(){
        System.out.println("In Constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        // TODO Auto-generated method stub
        return "Tomorow is your tennis match.....";
    }
}
