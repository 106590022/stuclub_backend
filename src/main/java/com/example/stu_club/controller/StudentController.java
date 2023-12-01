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

        // 在这里进行身份验证逻辑
        // 可以使用 Spring Security 或其他身份验证方式

        // 假设验证成功，返回成功消息
        return "Login successful for ID: " + id;
    }





}
