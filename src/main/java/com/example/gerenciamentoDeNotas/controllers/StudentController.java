package com.example.gerenciamentoDeNotas.controllers;

import com.example.gerenciamentoDeNotas.entities.Student;
import com.example.gerenciamentoDeNotas.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Student findStudentById(@PathVariable Long id){
        return studentService.findStudentById(id);
    }

    @GetMapping("/class")
    public List<Student> findAllStudentsByClass(@RequestParam String class_){
        return studentService.findAllStudentsByClass(class_);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping
    public Student updateClassByName(@RequestParam String name, @RequestParam String class_){
        return studentService.updateClassByName(name,class_);
    }

    @DeleteMapping
    public void deleteStudentByName(@RequestParam String name){
        studentService.deleteStudentByName(name);
    }


}
