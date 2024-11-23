package com.springboot.web.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.Entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {
      List<Student> stu;


      @PostConstruct
      public void load(){
       stu=new ArrayList<>();
        stu.add(new Student("khaled","ahamed"));
        stu.add(new Student("farzana","begum"));
        stu.add(new Student("ghouse","basha"));
      }


    @GetMapping("/students")
    public List<Student> getStudents(){

        return stu;
    }

    @GetMapping("/students/{studentid}")
    public Student getStudents(@PathVariable int studentid){

        return stu.get(studentid);
    }
}
