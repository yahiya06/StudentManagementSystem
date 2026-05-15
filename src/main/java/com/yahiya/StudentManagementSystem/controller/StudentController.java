package com.yahiya.StudentManagementSystem.controller;

import com.yahiya.StudentManagementSystem.model.Student;
import com.yahiya.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentController {

    @Autowired
    StudentService service;
}
