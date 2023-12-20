package com.example.stu_club.controller;

import com.example.stu_club.entity.Student;
import com.example.stu_club.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Student student) {
        // 假设 LoginRequest 包含 id 和 password 字段
        String id = student.getId();
        String password = student.getStupassword();

        Student studentFromService = StudentService.getStudentById(id);

        // 假设验证成功，返回成功消息
        if (studentFromService != null && studentFromService.getStupassword().equals(password)) {
            return "Login successful for ID: " + id;
        } else {
            return "Login failed for ID: " + id;
        }
    }
    @PostMapping("/updatePassword")
    public  String update(@RequestBody Student student){
        studentService.updateStudentPassword(student.getId(), student.getStupassword());
        return "update successful";
    }





}
