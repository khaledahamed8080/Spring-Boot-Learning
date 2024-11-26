package com.example.CrudDemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudDemo.Entity.Employee;
import com.example.CrudDemo.REPO.EmployeeRepository;

import jakarta.transaction.Transactional;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theemployeeRepository) {
        this.employeeRepository = theemployeeRepository;
    }

    @Override
    public List<Employee> getallemp() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        Employee emp= employeeRepository.save(theEmployee);
        return emp;
    }

    @Override
    public Employee getbyid(int id) {
        Optional<Employee> employee= employeeRepository.findById(id);

        Employee theEmployee=null;

        if (employee.isPresent()){
            theEmployee=employee.get();
        }else{
            throw new RuntimeException("Couldn't find the employee="+id);
        }
        return theEmployee;
    }

    @Override
    public void deletebyid(int id) {
       employeeRepository.deleteById( id);
       
    }

   
}
