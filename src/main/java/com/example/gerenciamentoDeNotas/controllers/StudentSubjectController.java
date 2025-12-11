package com.example.gerenciamentoDeNotas.controllers;

import com.example.gerenciamentoDeNotas.dtos.StudentPerformanceDTO;
import com.example.gerenciamentoDeNotas.services.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-performances")
public class StudentSubjectController {

    @Autowired
    private StudentSubjectService studentSubjectService;

    @PostMapping
    public void registerStudentPerformance(@RequestBody StudentPerformanceDTO studentPerformanceDTO){
        studentSubjectService.registerStudentPerformance(studentPerformanceDTO);
    }

    @GetMapping
    public List<StudentPerformanceDTO> findAllStudentPerformances(){
        return studentSubjectService.findAllStudentPerformances();
    }

    @GetMapping("/{id}")
    public List<StudentPerformanceDTO> findStudentPerformanceByStudentId(@PathVariable Long id){
        return studentSubjectService.findStudentPerformanceByStudentId(id);
    }

    @GetMapping(params = "name")
    public List<StudentPerformanceDTO> findStudentPerformanceByStudentName(@RequestParam String name){
        return studentSubjectService.findStudentPerformanceByStudentName(name);
    }

    @GetMapping(params = {"nameStudent","nameSubject"})
    public StudentPerformanceDTO findStudentPerformanceByStudentNameAndSubjectName(@RequestParam("nameStudent") String nameStudent, @RequestParam("nameSubject") String nameSubject){
        return studentSubjectService.findStudentPerformanceByStudentNameAndSubjectName(nameStudent,nameSubject);
    }

}
