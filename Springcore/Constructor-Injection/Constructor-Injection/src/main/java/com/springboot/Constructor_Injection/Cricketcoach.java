package com.springboot.Constructor_Injection;

import org.springframework.stereotype.Component;
import com.springboot.Constructor_Injection.Coach;

@Component
public class Cricketcoach implements Coach {
    @Override
    public String getDailyworkout() {
        return "PRACTICE FAST BOWLING TO WIN THE MATCH";
    }
}
