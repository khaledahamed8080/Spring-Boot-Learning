package com.springboot.web.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.Entity.Student;
import com.springboot.web.Entity.StudentErrorResponse;

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
        
        if((studentid >= stu.size() || studentid <0)){
            throw new StudentNotFoundException("Student not Found ->"+studentid);
        }
        return stu.get(studentid);
    }




    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exec){

        StudentErrorResponse error= new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exec.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
            return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }


    // Generic exception Handling
    //look into the Global Exception Handling code module
}
