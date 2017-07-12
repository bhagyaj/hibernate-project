package com.bhagya.repository;

import com.bhagya.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by bhagya on 7/11/17.
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Student save(Student student) {
        if(Long.valueOf(student.getStudentId())==null){
            entityManager.persist(student);
        }else {
            student=entityManager.merge(student);
        }
        entityManager.flush();
        return student;
    }

    @Override
    public Student get(int id) {
        System.out.println(id);
        return entityManager.find(Student.class,id);
    }

}
