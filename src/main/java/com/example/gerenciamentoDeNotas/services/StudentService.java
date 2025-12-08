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

    public Student findStudentById(Long id){
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    public List<Student> findAllStudentsByClass(String class_){
        return studentRepository.findAllStudentsByClass(class_);

    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateClassByName(String name, String class_){
        Student entity = studentRepository.findByName(name);
        if(class_ != null){
            entity.setClass_(class_);
            studentRepository.save(entity);
        }
        return entity;
    }
}
