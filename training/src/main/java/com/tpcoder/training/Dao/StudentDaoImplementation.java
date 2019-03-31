package com.tpcoder.training.Dao;

import com.tpcoder.training.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDaoImplementation implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Mart", "Computer Engineer"));
                put(2, new Student(2, "Jame", "Financial"));
                put(3, new Student(3, "Josh", "Chemical"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudent(){
        return students.values();
    }

    @Override
    public Student getStudentById(int id){
        return students.get(id);
    }

    @Override
    public Collection<Student> deleteStudentById(int id){
        students.remove(id);
        return students.values();
    }

    @Override
    public Student updateStudentById(int id, Student student){
        Student tmpStudent = students.get(id);
        tmpStudent.setName(student.getName());
        tmpStudent.setCourse(student.getCourse());
        students.put(student.getId(), student);
        return students.get(student.getId());
    }

    @Override
    public Student insertStudentToDb(Student student){
        students.put(student.getId(), student);
        return students.get(student.getId());
    }

}
