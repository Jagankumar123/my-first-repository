package com.registration.form.controller;

import com.registration.form.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



public class ShowStudentList {

    @Autowired
    StudentService studentService;

    @GetMapping("/studentList")
    public String showStudentList(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "studentList";
    }
}