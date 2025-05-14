package com.project.learn_spring02.JavaDatabaseConnectivity.Dao;

import java.util.List;

import com.project.learn_spring02.JavaDatabaseConnectivity.Dao.Entities.Student;

public interface StudentRepository {
    int insert(Student student);

    int updateStudent(Student student);

    int deleteStudent(int studentID);

    Student getStudent(int studentID);

    List<Student> getAllStudents();
}
