package com.example.stu_club.service;

import com.example.stu_club.dao.StudentDao;
import com.example.stu_club.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getStudentById(String id) {
        return studentDao.findById(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    public void updateStudent(Student student) {
        studentDao.update(student);
    }

    public void deleteStudent(String id) {
        studentDao.delete(id);
    }
}
