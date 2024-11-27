package com.example.CrudDemo.REPO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.CrudDemo.Entity.Employee;

@RepositoryRestResource(path = "list")
public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{
    
}
