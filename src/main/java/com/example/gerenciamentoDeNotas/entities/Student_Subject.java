package com.example.gerenciamentoDeNotas.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class Student_Subject {

    @EmbeddedId
    private Student_SubjectPK id = new Student_SubjectPK();

    private Double grade;
    private Integer absence;

    public Student_Subject(){

    }

    public Student_Subject(Student student, Subject subject, Double grade, Integer absence) {
        this.id.setStudent(student);
        this.id.setSubject(subject);
        this.grade = grade;
        this.absence = absence;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student_Subject that = (Student_Subject) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
