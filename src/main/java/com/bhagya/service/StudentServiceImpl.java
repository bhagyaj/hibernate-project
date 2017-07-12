package com.bhagya.service;

import com.bhagya.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhagya.repository.StudentRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bhagya on 7/11/17.
 */
@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
    public Student get(int id){
        return studentRepository.get(id);
    }
}
