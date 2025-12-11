package com.example.gerenciamentoDeNotas.dtos;

public class StudentPerformanceDTO {
    private String subjectName;
    private String studentName;
    private Double grade;
    private Integer absence;

    public StudentPerformanceDTO(){

    }

    public StudentPerformanceDTO(String subjectName, String studentName, Double grade, Integer absence) {
        this.subjectName = subjectName;
        this.studentName = studentName;
        this.grade = grade;
        this.absence = absence;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
