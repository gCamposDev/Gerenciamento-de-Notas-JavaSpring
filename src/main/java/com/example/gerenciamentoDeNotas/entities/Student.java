package com.example.gerenciamentoDeNotas.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;

    private String name;
    private String email;
    private String phone;
    private String class_;

    public Student(){

    }

    public Student(Long student_id, String name, String email, String phone, String class_) {
        this.student_id = student_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.class_ = class_;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(student_id, student.student_id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(student_id);
    }
}
