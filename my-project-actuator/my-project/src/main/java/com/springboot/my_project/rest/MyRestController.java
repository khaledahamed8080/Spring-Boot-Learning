package com.springboot.my_project.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {
    
    @GetMapping("/")
    public String sayHello(){
        return "HELLO WORLD....!";
    }

    // new endpoint for workout
    @GetMapping("/workout")
    public String callWorkout(){
        return "workout is essential for our body";
    }
    

    @GetMapping("fortune")
    public String getfortune(){
        return "FORTUNE IS ESSENTIAL FOR LIVINIG A GOOD LIFE";
    }
}
