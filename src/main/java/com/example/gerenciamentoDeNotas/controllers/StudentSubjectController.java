package com.example.gerenciamentoDeNotas.controllers;

import com.example.gerenciamentoDeNotas.dtos.StudentPerformanceDTO;
import com.example.gerenciamentoDeNotas.services.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students-performances")
public class StudentSubjectController {

    @Autowired
    private StudentSubjectService studentSubjectService;

    @PostMapping
    public void registerStudentPerformance(@RequestBody StudentPerformanceDTO studentPerformanceDTO){
        studentSubjectService.registerStudentPerformance(studentPerformanceDTO);
    }

    @GetMapping
    public List<StudentPerformanceDTO> findAllStudentsPerformances(){
        return studentSubjectService.findAllStudentsPerformances();
    }

    @GetMapping("/{id}")
    public List<StudentPerformanceDTO> findStudentPerformancesByStudentId(@PathVariable Long id){
        return studentSubjectService.findStudentPerformancesByStudentId(id);
    }

    @GetMapping(params = "nameStudent")
    public List<StudentPerformanceDTO> findStudentPerformancesByStudentName(@RequestParam String nameStudent){
        return studentSubjectService.findStudentPerformancesByStudentName(nameStudent);
    }

    @GetMapping(params = {"nameStudent","nameSubject"})
    public StudentPerformanceDTO findStudentPerformanceByStudentNameAndSubjectName(@RequestParam("nameStudent") String nameStudent, @RequestParam("nameSubject") String nameSubject){
        return studentSubjectService.findStudentPerformanceByStudentNameAndSubjectName(nameStudent,nameSubject);
    }

    @GetMapping(params = "nameSubject")
    public List<StudentPerformanceDTO> findStudentsPerformancesBySubjectName(@RequestParam String nameSubject){
        return studentSubjectService.findStudentsPerformancesBySubjectName(nameSubject);
    }

}
