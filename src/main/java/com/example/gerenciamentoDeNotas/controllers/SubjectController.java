package com.example.gerenciamentoDeNotas.controllers;

import com.example.gerenciamentoDeNotas.entities.Subject;
import com.example.gerenciamentoDeNotas.repositories.SubjectRepository;
import com.example.gerenciamentoDeNotas.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Subject findSubjectById(@PathVariable Long id){
        return subjectService.findSubjectById(id);
    }

    @GetMapping("/name")
    public Subject findSubjectByName(@RequestParam String name){
        return subjectService.findSubjectByName(name);
    }














}
