package com.springboot.Constructor_Injection.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.Constructor_Injection.Coach;
import com.springboot.Constructor_Injection.SwimCoach;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
    
}
