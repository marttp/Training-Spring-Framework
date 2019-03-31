package com.tpcoder.training.Dao;

import com.tpcoder.training.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudent();

    Student getStudentById(int id);

    Collection<Student> deleteStudentById(int id);

    Student updateStudentById(int id, Student student);

    Student insertStudentToDb(Student student);
}
