package com.moeen.Student.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor

@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
   // @Column(name = "studentName")
    private String studentName;
    //@Column(name="studentAge")
    private String studentAge;
    //@Column(name="studentResult")
    private int StudentResult;

//    public Student(Long studentId, String studentName, String studentAge, int studentResult) {
//        this.studentId = studentId;
//        this.studentName = studentName;
//        this.studentAge = studentAge;
//        this.StudentResult = studentResult;
//    }
//    public Student()
//    {

    //}

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentResult() {
        return StudentResult;
    }

    public void setStudentResult(int studentResult) {
        StudentResult = studentResult;
    }
}
