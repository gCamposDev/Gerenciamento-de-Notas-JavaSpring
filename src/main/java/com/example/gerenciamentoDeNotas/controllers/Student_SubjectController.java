package com.example.gerenciamentoDeNotas.controllers;

import com.example.gerenciamentoDeNotas.dtos.RegisterGradeDTO;
import com.example.gerenciamentoDeNotas.entities.Student_Subject;
import com.example.gerenciamentoDeNotas.services.Student_SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grades")
public class Student_SubjectController {

    @Autowired
    private Student_SubjectService studentSubjectService;

    @PostMapping
    public void registerGrade(@RequestBody RegisterGradeDTO registerGradeDTO){
        studentSubjectService.registerGrade(registerGradeDTO);

    }

}
