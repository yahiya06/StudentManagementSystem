package com.yahiya.StudentManagementSystem.service;

import com.yahiya.StudentManagementSystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    @Autowired
    StudentRepo repo;
}
