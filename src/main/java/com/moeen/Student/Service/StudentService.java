package com.moeen.Student.Service;

import com.moeen.Student.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentByID(Long id);
    Student updateStudent(Student student,Long id);
    void deleteStudent(Long id);

}
