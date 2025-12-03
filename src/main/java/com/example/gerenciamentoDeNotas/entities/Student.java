package com.example.gerenciamentoDeNotas.entities;

public class Student {
    private Long student_id;
    private String name;
    private String email;
    private Integer phone;
    private String class_;

    public Student(){

    }

    public Student(Long student_id, String name, String email, Integer phone, String class_) {
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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }
}
