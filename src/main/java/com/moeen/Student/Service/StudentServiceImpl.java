package com.moeen.Student.Service;

import com.moeen.Student.Entity.Student;
import com.moeen.Student.StudentRepo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private final StudentRepo studentRepo;


    public StudentServiceImpl(StudentRepo studentRepo) {
        //super();
        this.studentRepo = studentRepo;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public Student getStudentByID(Long id) {
        Optional<Student> student= studentRepo.findById(id);
       return student.get();
        //return studentRepo.findById(id).orElseThrow(()->new RuntimeException());
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        //boolean existStudent = studentRepo.existsById(id);
        Optional<Student> isStudentExist=studentRepo.findById(id);//.orElseThrow()->new RuntimeException());
        if(isStudentExist.isPresent())
        {
            Student newStudent = isStudentExist.get();
            //newStudent.setStudentId(student.getStudentId());
            newStudent.setStudentName(student.getStudentName());
            newStudent.setStudentAge(student.getStudentAge());
            newStudent.setStudentResult(student.getStudentResult());
            studentRepo.save(newStudent);

        }
//

        return student;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
