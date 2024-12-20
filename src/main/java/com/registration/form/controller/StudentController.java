package com.registration.form.controller;

import com.registration.form.entity.Student;
import com.registration.form.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Student saved successfully";
    }
}
