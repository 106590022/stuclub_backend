package com.example.stu_club.entity;

import javax.persistence.*;

@Entity
@Table(name = "stu_basis")
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;
    private String stu_name;
    private int stu_num;
    private String stupassword;
    private String email;

    public Student() {
        // 默认构造函数
    }

    public Student(String id, String stu_name, int stu_num, String stupassword, String email) {
        this.id = id;
        this.stu_name = stu_name;
        this.stu_num = stu_num;
        this.stupassword = stupassword;
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
        return stupassword;
    }

    public void setStupassword(String stupassword) {
        this.stupassword = stupassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}