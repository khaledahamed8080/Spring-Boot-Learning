package com.example.CrudDemo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CrudDemo.Entity.Employee;
import com.example.CrudDemo.Service.EmployeeService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    private EmployeeService employeeService;

    public RestController(EmployeeService theemployeeService){
        this.employeeService=theemployeeService;
    }
    @GetMapping("/emp")
    public List<Employee> getlist(){
        return employeeService.getallemp();
    }
    
    @GetMapping("/emp/{stuid}")
    public Employee getemp(@PathVariable int stuid){
        Employee emp=employeeService.getbyid(stuid);
        if(emp==null){
            throw new RuntimeException("COULDN'T FIND THE EMPLOYEE IN THE DATABASE -> "+stuid);
        }
        return emp;
    }
    
    @PostMapping("/emp")
    public Employee createemp(@RequestBody Employee thEmployee ){
      Employee emp=employeeService.save(thEmployee);
      return emp ;
    }

    @PutMapping("/emp")
    public Employee updateemp(@RequestBody Employee thEmployee ){
      Employee emp=employeeService.save(thEmployee);
      return emp ;
    }

    @DeleteMapping("/emp/{empid}")
    public Employee deletebyid(@PathVariable int empid ){
      Employee emp=employeeService.getbyid(empid);
      if(emp== null){
        throw new RuntimeException("Employee id not not found="+empid);
      }
      employeeService.deletebyid(empid);
      return emp;
    }

}
