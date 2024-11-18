package com.springboot.Hibernate.DAO;

import java.util.List;

import com.springboot.Hibernate.entity.Student;

public interface StudentDAO {
    void save(Student thestudent);
    Student findbyId(Integer id);

    List<Student> findAll();
    List<Student> findbyLastName(String lastname);

    void update(Student thestudent);

    void delete(Integer id);
    int DeleteAll();
}
