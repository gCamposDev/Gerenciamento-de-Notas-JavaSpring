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

    public Student_Subject(){

    }

    public Student_Subject(Student student, Subject subject, Long id, Double grade, Integer absence) {
        this.student = student;
        this.subject = subject;
        this.id = id;
        this.grade = grade;
        this.absence = absence;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getAbsence() {
        return absence;
    }

    public void setAbsence(Integer absence) {
        this.absence = absence;
    }
}
