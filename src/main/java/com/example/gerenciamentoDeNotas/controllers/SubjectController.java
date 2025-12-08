package com.example.gerenciamentoDeNotas.controllers;

import com.example.gerenciamentoDeNotas.entities.Subject;
import com.example.gerenciamentoDeNotas.repositories.SubjectRepository;
import com.example.gerenciamentoDeNotas.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> findAllSubjects(){
        return subjectService.findAllSubjects();
    }
}
