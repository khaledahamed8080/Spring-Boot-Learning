package com.springboot.web.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Student {
    private String FirstName;
    private String LastName;

    public Student(){

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
    
    
    public Student(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Student [FirstName=" + FirstName + ", LastName=" + LastName + "]";
    }
    

}
