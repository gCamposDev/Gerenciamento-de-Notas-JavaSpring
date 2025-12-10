package com.example.gerenciamentoDeNotas.services;

import com.example.gerenciamentoDeNotas.dtos.RegisterGradeDTO;
import com.example.gerenciamentoDeNotas.entities.Student;
import com.example.gerenciamentoDeNotas.entities.Student_Subject;
import com.example.gerenciamentoDeNotas.repositories.Student_SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_SubjectService {

    @Autowired
    private Student_SubjectRepository studentSubjectRepository;

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    public void registerGrade(RegisterGradeDTO registerGradeDTO){
        Student_Subject studentSubject = new Student_Subject();

        Student student = studentService.findStudentByName(registerGradeDTO.getStudentName());


    }
}
