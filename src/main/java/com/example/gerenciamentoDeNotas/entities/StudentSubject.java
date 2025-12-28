package com.example.gerenciamentoDeNotas.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(
        uniqueConstraints = {@UniqueConstraint(columnNames = {"student_id", "subject_id"})}
)// Garante que não existam registros duplicados para o mesmo student e subject,
// ou seja, não é possível registrar duas studentPerformance do mesmo aluno e da mesma matéria
public class StudentSubject {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double grade;
    private Integer absence;

    @ManyToOne
    @JoinColumn(name= "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name="subject_id")
    private Subject subject;

    public StudentSubject(Student student, Subject subject, Double grade, Integer absence ) {
        this.student = student;
        this.subject = subject;
        this.grade = grade;
        this.absence = absence;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getAbsence() {
        return absence;
    }

    public void setAbsence(Integer absence) {
        this.absence = absence;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
