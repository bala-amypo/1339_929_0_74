package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo strepo;

    @Override
    public Student insertStudent(Student st) {
        
    }

    @Override
    public List<Student> getAllStudents() {
        
    }

    @Override
    public Student getById(Long id) {
        
    }
    
}
