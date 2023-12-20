package com.example.stu_club.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "stu_basis")
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;
    private String stu_name;
    private int stu_num;
    private String stu_password;
    private String email;

    public Student() {
        // 默认构造函数
    }

    public Student(String id, String stu_name, int stu_num, String stu_password, String email) {
        this.id = id;
        this.stu_name = stu_name;
        this.stu_num = stu_num;
        this.stu_password = stu_password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStu_num() {
        return stu_num;
    }

    public void setStu_num(int stu_num) {
        this.stu_num = stu_num;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStupassword() {
        return stu_password;
    }

    public void setStu_password(String stu_password) {
        this.stu_password = stu_password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}