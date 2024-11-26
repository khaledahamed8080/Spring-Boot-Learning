package com.example.CrudDemo.Service;

import java.util.List;

import com.example.CrudDemo.Entity.Employee;

public interface EmployeeService {
    List<Employee> getallemp();
    Employee save(Employee theEmployee);
 Employee getbyid(int empid);
 void deletebyid(int empid);
}
