package com.tpcoder.training.Controller;

import com.tpcoder.training.Entity.Student;
import com.tpcoder.training.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public Collection<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return  studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public Collection<Student> deleteStudentById(@PathVariable int id){
        return studentService.deleteStudentById(id);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student updateStudentById(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudentById(id, student);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }
}
