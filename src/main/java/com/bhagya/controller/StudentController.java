package com.bhagya.controller;

import com.bhagya.jView.View;
import com.bhagya.model.Student;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bhagya.service.StudentService;

/**
 * Created by bhagya on 7/11/17.
 */

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
    @RequestMapping(value = "/addOwner", method = RequestMethod.POST)
    @CrossOrigin
    public void updateEvent(@RequestBody Student student){
        System.out.println(student.getStudentName());
        studentService.save(student);
    }
//    @JsonView(View.Summary.class)
    @RequestMapping(value="/Students/{studentId}", method= RequestMethod.GET)
    @CrossOrigin
    public Student get(@PathVariable("studentId") int id){
        System.out.println(id);
        return studentService.get(id);
    }
}
