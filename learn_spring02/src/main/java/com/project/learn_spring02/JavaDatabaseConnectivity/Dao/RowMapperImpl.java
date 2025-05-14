package com.project.learn_spring02.JavaDatabaseConnectivity.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.learn_spring02.JavaDatabaseConnectivity.Dao.Entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

    @SuppressWarnings("null")
    public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt(1));
        student.setName(resultSet.getString(2));
        student.setCity(resultSet.getString(3));

        return student;
    }
}
