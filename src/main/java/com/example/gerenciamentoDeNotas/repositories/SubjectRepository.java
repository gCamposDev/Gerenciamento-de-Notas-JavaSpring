package com.example.gerenciamentoDeNotas.repositories;

import com.example.gerenciamentoDeNotas.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
    @Query(nativeQuery = true, value = """
        SELECT * FROM subject WHERE name = :name
        """)
    Subject findSubjectByName(String name);
}

