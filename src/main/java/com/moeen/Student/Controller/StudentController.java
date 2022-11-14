package com.moeen.Student.Controller;


import com.moeen.Student.Entity.Student;
import com.moeen.Student.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/saveStudent")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/saveStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student)
    {
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }
    @GetMapping("/AllStudent")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }
    @GetMapping("{studentId}")
//    public Optional<Student> getStudentByID(
//           @PathVariable Long studentId)
//    {
//        return studentService.getStudentByID(studentId);
//    }
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") Long studentId)
    {

        return new ResponseEntity<Student>(studentService.getStudentByID(studentId),HttpStatus.OK);

    }
    @PutMapping("{studentId}")
    public  ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("studentId") Long studentId)
    {
        return new ResponseEntity<Student>(studentService.updateStudent(student,studentId),HttpStatus.OK);
    }
    @DeleteMapping("{studentId}")
    public ResponseEntity<Student> deleteStudentByID(@PathVariable("studentId") Long studentId)
    {
        studentService.deleteStudent(studentId);
        return new ResponseEntity("Delete Student",HttpStatus.OK);
    }


}
