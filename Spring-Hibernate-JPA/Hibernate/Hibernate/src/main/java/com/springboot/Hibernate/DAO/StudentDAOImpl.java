package com.springboot.Hibernate.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.Hibernate.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager entityManager;

    
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    @Transactional
    public void save(Student thestudent) {
        entityManager.persist(thestudent);
        
    }
    @Override
    public Student findbyId(Integer id) {
     return entityManager.find(Student.class,id);  
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> thequery=entityManager.createQuery("From Student",Student.class);
        return thequery.getResultList();
    }
}