package com.springboot.web.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.Entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
      
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> stu=new ArrayList<>();
        stu.add(new Student("khaled","ahamed"));
        stu.add(new Student("farzana","begum"));
        stu.add(new Student("ghouse","basha"));

        return stu;
    }
}
