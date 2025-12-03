package com.example.gerenciamentoDeNotas.repositories;

import com.example.gerenciamentoDeNotas.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
