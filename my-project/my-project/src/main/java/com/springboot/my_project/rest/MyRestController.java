package com.springboot.my_project.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {
    
    @GetMapping("/")
    public String sayHello(){
        return "HELLO WORLD....!";
    }
}
