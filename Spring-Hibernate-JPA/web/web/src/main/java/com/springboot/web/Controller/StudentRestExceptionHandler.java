package com.springboot.web.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.web.Entity.StudentErrorResponse;

@ControllerAdvice
public class StudentRestExceptionHandler {
    

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exec){

        StudentErrorResponse error= new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exec.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
            return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }
}
