package repository;

import model.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by bhagya on 7/11/17.
 */
public class StudentRepositoryImpl implements StudentRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Student save(Student student) {
        if(student.getStudentId()==null){
            entityManager.persist(student);
        }else {
            student=entityManager.merge(student);
        }
        entityManager.flush();
        return student;
    }
}
