package com.springboot.Constructor_Injection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import com.springboot.Constructor_Injection.Coach;

@Component
@Lazy
public class Cricketcoach implements Coach {
    public Cricketcoach(){
        System.out.println("In Constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return "PRACTICE FAST BOWLING TO WIN THE MATCH";
    }
}
