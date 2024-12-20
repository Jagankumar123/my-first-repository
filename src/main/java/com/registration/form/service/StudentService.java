package com.registration.form.service;

import com.registration.form.entity.Student;
import com.registration.form.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student) {
        try {
            studentRepository.save(student);
        } catch (Exception e) {
            throw new RuntimeException("Failed to save student", e);
        }
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

