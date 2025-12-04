package com.example.gerenciamentoDeNotas.controllers;

import com.example.gerenciamentoDeNotas.entities.Student;
import com.example.gerenciamentoDeNotas.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Student findStundentById(@PathVariable Long id){
        return studentService.findStudentById(id);
    }
}
