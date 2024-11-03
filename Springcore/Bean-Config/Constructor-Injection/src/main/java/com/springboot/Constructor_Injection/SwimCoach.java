package com.springboot.Constructor_Injection;

public class SwimCoach implements Coach{
     public SwimCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
     }
     
     @Override
     public String getDailyworkout() {
    // TODO Auto-generated method stub
     return "Swimming for about 30 mins......";
  }
}
