package com.example.gerenciamentoDeNotas.services;

import com.example.gerenciamentoDeNotas.entities.Subject;
import com.example.gerenciamentoDeNotas.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> findAllSubjects(){
        return subjectRepository.findAll();
    }
}
