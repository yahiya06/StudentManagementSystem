package com.yahiya.StudentManagementSystem.service;

import com.yahiya.StudentManagementSystem.model.Student;
import com.yahiya.StudentManagementSystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;


    public Student addStudent(Student student) {
        return repo.save(student);
    }
}
