package com.example.gerenciamentoDeNotas.entities;

public class Subject {
    private Long subject_id;
    private String name;
    private Integer academic_load;

    public Subject(){

    }

    public Subject(Long subject_id, String name, Integer academic_load) {
        this.subject_id = subject_id;
        this.name = name;
        this.academic_load = academic_load;
    }

    public Long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAcademic_load() {
        return academic_load;
    }

    public void setAcademic_load(Integer academic_load) {
        this.academic_load = academic_load;
    }
}
