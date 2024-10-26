package com.springboot.Constructor_Injection;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    @Override
    public String getDailyworkout() {
        // TODO Auto-generated method stub
        return "Practice batting for 30 mins ";
    }
    
}
