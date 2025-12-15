package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/PostStudent")
    public Student postStd(@RequestBody Student st){
        return studentService.insertStudent(st);
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentService.getAllStudents();
    }

    @GetMapping("/get/{id}")
    public Student get(@PathVariable Long id){
        Optional<Student> st=
        return ;
    }
}
