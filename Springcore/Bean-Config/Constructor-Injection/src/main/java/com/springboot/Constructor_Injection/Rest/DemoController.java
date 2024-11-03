package com.springboot.Constructor_Injection.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Constructor_Injection.Coach;

@RestController
public class DemoController {
    private Coach mycoach;
    private Coach anothercoach;
    
    //Through Constructor injection
    @Autowired
    public DemoController(@Qualifier("swimCoach")Coach thecoach){
        System.out.println("In Constructor:"+getClass().getSimpleName());
        this.mycoach=thecoach;
    }
    
    @GetMapping("/bowl")
    public String getcoach(){
         return mycoach.getDailyworkout();
    }
    
}