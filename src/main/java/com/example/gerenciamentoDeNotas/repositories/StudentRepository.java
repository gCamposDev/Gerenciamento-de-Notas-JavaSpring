package com.example.gerenciamentoDeNotas.repositories;

import com.example.gerenciamentoDeNotas.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query(nativeQuery = true, value = """
        SELECT * FROM student WHERE class_ = :class_
        """)
    List<Student> findAllStudentsByClass(String class_);

    @Query(nativeQuery = true, value = """
        SELECT * FROM student WHERE name = :name
        """)
    Student findStudentByName(String name);

}

