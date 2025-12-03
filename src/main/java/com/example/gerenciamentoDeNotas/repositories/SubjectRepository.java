package com.example.gerenciamentoDeNotas.repositories;

import com.example.gerenciamentoDeNotas.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
