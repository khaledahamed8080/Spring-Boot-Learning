package com.springboot.web.Controller;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message){
        super(message);
    }

    public StudentNotFoundException(String message,Throwable causes){
        super(message,causes);
    }

    public StudentNotFoundException(Throwable causes){
        super(causes);
    }
    
}
