package com.example.stu_club.dao;

import com.example.stu_club.entity.Student;
import org.springframework.stereotype.Repository;
import jakarta.persistence.*;


import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student findById(String id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // 执行查询所有学生的操作...
        // 注意：此处应该使用查询语句或Criteria查询等方式，根据具体需求进行实现
        return null;
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
    }

    public void updatePassword(String studentId, String newPassword) {
        // 使用 HQL 更新密码
        String hql = "UPDATE Student SET stu_password = :newPassword WHERE id = :studentId";
        entityManager.createQuery(hql)
                .setParameter("newPassword", newPassword)
                .setParameter("studentId", studentId)
                .executeUpdate();
    }

    
    @Override
    public void delete(String id) {
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            entityManager.remove(student);
        }
    }
}
