package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        Optional<Student> st=studentService.getOneStudent(id);
        return st.get();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id,@RequestBody Student newStudent){
        Optional<Student> student=studentService.getOneStudent(id);
        if(student.isPresent()){
            Student oldStudent=student.get();
            oldStudent.setName(newStudent.getName());
            oldStudent.setEmail(newStudent.getEmail());
            oldStudent.setDob(newStudent.getDob());
            oldStudent.setCgpa(newStudent.getCgpa());
            studentService.insertStudent(oldStudent);
            return "Updated Success";
        }
        return "Id not found";
    }

    @DeleteMapping("/del/{id}")
    public String deleteStudent(@PathVariable Long id){
        
    }
}
