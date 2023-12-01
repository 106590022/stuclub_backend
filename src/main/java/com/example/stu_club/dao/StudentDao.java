

package com.example.stu_club.dao;

import com.example.stu_club.entity.Student;
import java.util.List;

public interface StudentDao {
    Student findById(String id);
    List<Student> findAll();
    void save(Student student);
    void update(Student student);
    void delete(String id);
}

