package com.bhagya.service;

import com.bhagya.model.Student;

/**
 * Created by bhagya on 7/11/17.
 */
public interface StudentService {
    Student save(Student student);

    Student get(int id);
}
