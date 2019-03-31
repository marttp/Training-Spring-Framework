package com.tpcoder.training.Service;

import com.tpcoder.training.Dao.StudentDao;
import com.tpcoder.training.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }

    public Collection<Student> deleteStudentById(int id){
        return studentDao.deleteStudentById(id);
    }

    public Student updateStudentById(int id, Student student){
        return this.studentDao.updateStudentById(id, student);
    }

    public Student insertStudent(Student student){
        return this.studentDao.insertStudentToDb(student);
    }
}
