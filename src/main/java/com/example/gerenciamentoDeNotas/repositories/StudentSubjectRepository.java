package com.example.gerenciamentoDeNotas.repositories;

import com.example.gerenciamentoDeNotas.dtos.StudentPerformanceDTO;
import com.example.gerenciamentoDeNotas.entities.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject, Long> {
    @Query(nativeQuery = true, value = """
        SELECT student.name AS student, subject.name AS subject, grade, absence FROM student_subject
        INNER JOIN student ON student.student_id = student_subject.student_id
        INNER JOIN subject ON subject.subject_id = student_subject.subject_id
        """)
    List<StudentPerformanceDTO> findAllStudentPerformances();

    @Query(nativeQuery = true, value = """
        SELECT student.name AS student, subject.name AS subject, grade, absence FROM student_subject
        INNER JOIN student ON student.student_id = student_subject.student_id
        INNER JOIN subject ON subject.subject_id = student_subject.subject_id
        WHERE student.student_id = :id
        """)
    List<StudentPerformanceDTO> findStudentPerformanceByStudentId(Long id);

    @Query(nativeQuery = true, value = """
        SELECT student.name AS student, subject.name AS subject, grade, absence FROM student_subject
        INNER JOIN student ON student.student_id = student_subject.student_id
        INNER JOIN subject ON subject.subject_id = student_subject.subject_id
        WHERE student.name = :name
        """)
    List<StudentPerformanceDTO> findStudentPerformanceByStudentName(String name);
}
