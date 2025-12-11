package com.example.gerenciamentoDeNotas.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class StudentSubject {

    @EmbeddedId
    private StudentSubjectPK id = new StudentSubjectPK();

    private Double grade;
    private Integer absence;

    public StudentSubject(){

    }

    public StudentSubject(Student student, Subject subject, Double grade, Integer absence) {
        this.id.setStudent(student);
        this.id.setSubject(subject);
        this.grade = grade;
        this.absence = absence;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentSubject that = (StudentSubject) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
