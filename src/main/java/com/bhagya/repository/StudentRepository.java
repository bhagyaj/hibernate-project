package com.bhagya.repository;

import com.bhagya.model.Student;

/**
 * Created by bhagya on 7/11/17.
 */
public interface StudentRepository {
    Student save(Student student);

    Student get(int id);
}
