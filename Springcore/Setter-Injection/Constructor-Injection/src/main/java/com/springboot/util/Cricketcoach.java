package com.springboot.util;

import org.springframework.stereotype.Component;

@Component
public class Cricketcoach implements Coach {
    @Override
    public String getDailyworkout() {
        return "PRACTICE FAST BOWLING TO WIN THE MATCH";
    }
}
