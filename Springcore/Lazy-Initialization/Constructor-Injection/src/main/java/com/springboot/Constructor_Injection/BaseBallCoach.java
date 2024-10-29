package com.springboot.Constructor_Injection;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    public BaseBallCoach(){
        System.out.println("In Constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        // TODO Auto-generated method stub
        return "Practice batting for 30 mins ";
    }
    
}
