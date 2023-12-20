package com.example.stu_club.service;

import com.example.stu_club.dao.StudentDao;
import com.example.stu_club.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    private static StudentDao studentDao = null;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public static Student getStudentById(String id) {
        return studentDao.findById(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    @Transactional
    public void updateStudentPassword(String studentId, String newPassword) {
        studentDao.updatePassword(studentId, newPassword);
    }

    public void deleteStudent(String id) {
        studentDao.delete(id);
    }
}
