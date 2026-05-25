package com.yahiya.StudentManagementSystem.controller;

import com.yahiya.StudentManagementSystem.model.Student;
import com.yahiya.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/")
    public String greet(){
        return "hellow";
    }

    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(Student student){
        try {
            Student s1 = service.addStudent(student);
            return new ResponseEntity<>(s1, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
