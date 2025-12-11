package com.example.gerenciamentoDeNotas.controllers;

import com.example.gerenciamentoDeNotas.dtos.StudentPerformanceDTO;
import com.example.gerenciamentoDeNotas.services.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
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

}
