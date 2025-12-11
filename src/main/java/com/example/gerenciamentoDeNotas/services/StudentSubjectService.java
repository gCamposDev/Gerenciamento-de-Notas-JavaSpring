package com.example.gerenciamentoDeNotas.services;

import com.example.gerenciamentoDeNotas.dtos.StudentPerformanceDTO;
import com.example.gerenciamentoDeNotas.entities.Student;
import com.example.gerenciamentoDeNotas.entities.StudentSubject;
import com.example.gerenciamentoDeNotas.entities.Subject;
import com.example.gerenciamentoDeNotas.repositories.StudentSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSubjectService {

    @Autowired
    private StudentSubjectRepository studentSubjectRepository;

    //Injeto studentService e subjectService pois preciso de métodos presentes neles.
    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    public void registerStudentPerformance(StudentPerformanceDTO StudentPerformanceDTO) {
        //Busco as duas entidades no banco para saber o ID.
        Student student = studentService.findStudentByName(StudentPerformanceDTO.getStudentName());
        Subject subject = subjectService.findSubjectByName(StudentPerformanceDTO.getSubjectName());

        StudentSubject studentSubject = new StudentSubject(student, subject, StudentPerformanceDTO.getGrade(), StudentPerformanceDTO.getAbsence());

        studentSubjectRepository.save(studentSubject);

    }

    public List<StudentPerformanceDTO> findAllStudentPerformances() {
        return studentSubjectRepository.findAllStudentPerformances();
    }

    public List<StudentPerformanceDTO> findStudentPerformanceByStudentId(Long id) {
        return studentSubjectRepository.findStudentPerformanceByStudentId(id);
    }

    public List<StudentPerformanceDTO> findStudentPerformanceByStudentName(String name) {
        return studentSubjectRepository.findStudentPerformanceByStudentName(name);
    }

    public StudentPerformanceDTO findStudentPerformanceByStudentNameAndSubjectName(String nameStudent, String nameSubject) {
        return studentSubjectRepository.findStudentPerformanceByStudentNameAndSubjectName(nameStudent, nameSubject);
    }
}
