package com.example.gerenciamentoDeNotas.services;

import com.example.gerenciamentoDeNotas.entities.Student;
import com.example.gerenciamentoDeNotas.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }
}
