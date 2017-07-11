package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

/**
 * Created by bhagya on 7/11/17.
 */
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/addOwner", method = RequestMethod.POST)
    public void updateEvent(@RequestBody Student student){
        studentService.save(student);
    }
}
