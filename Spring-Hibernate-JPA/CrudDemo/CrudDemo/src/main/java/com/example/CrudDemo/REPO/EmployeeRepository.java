package com.example.CrudDemo.REPO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CrudDemo.Entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{
    
}
