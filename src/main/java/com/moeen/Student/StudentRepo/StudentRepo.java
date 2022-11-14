package com.moeen.Student.StudentRepo;

import com.moeen.Student.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends CrudRepository<Student,Long> {
    //Student savaStudent(Student student);
}
