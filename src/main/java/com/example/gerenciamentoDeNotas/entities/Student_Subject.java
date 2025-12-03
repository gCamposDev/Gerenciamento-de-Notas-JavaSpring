package com.example.gerenciamentoDeNotas.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Student_Subject {

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double grade;
    private Integer absence;
}
