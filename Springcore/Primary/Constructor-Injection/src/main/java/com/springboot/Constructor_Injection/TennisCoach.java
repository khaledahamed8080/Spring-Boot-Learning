package com.springboot.Constructor_Injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {
    @Override
    public String getDailyworkout() {
        // TODO Auto-generated method stub
        return "Tomorow is your tennis match.....";
    }
}
