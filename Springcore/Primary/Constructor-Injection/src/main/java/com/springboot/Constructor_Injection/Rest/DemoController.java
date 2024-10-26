package com.springboot.Constructor_Injection.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Constructor_Injection.Coach;

@RestController
public class DemoController {
    private Coach mycoach;
    
    //Through Constructor injection
    @Autowired
    public DemoController(Coach thecoach){
        this.mycoach=thecoach;
    }
    
    @GetMapping("/bowl")
    public String getcoach(){
         return mycoach.getDailyworkout();
    }

}
