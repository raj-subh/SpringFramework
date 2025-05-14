package com.project.learn_spring02.JavaDatabaseConnectivity.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.project.learn_spring02.JavaDatabaseConnectivity.Dao.Entities.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public StudentRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        // First, check if the student already exists
        String checkQuery = "SELECT COUNT(*) FROM student WHERE id=?";
        Integer count = jdbcTemplate.queryForObject(checkQuery, Integer.class, student.getId());

        if (count == null) {
            count = 0; // Default to 0 if the student is not found
        }

        if (count > 0) {
            throw new DuplicateKeyException("Student with ID " + student.getId() + " already exists!");
        }

        String query = "INSERT INTO student(id, name, city) VALUES(?, ?, ?)";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int updateStudent(Student student) {
        // Step 1: Check if the student exists
        String checkQuery = "SELECT COUNT(*) FROM student WHERE id = ?";
        Integer count = jdbcTemplate.queryForObject(checkQuery, Integer.class, student.getId());

        if (count != null && count > 0) {
            // Step 2: If student exists, update the record
            String updateQuery = "UPDATE student SET name = ?, city = ? WHERE id = ?";
            return jdbcTemplate.update(updateQuery, student.getName(), student.getCity(), student.getId());
        } else {
            System.out.println("❌ Error: No student found with ID " + student.getId());
            return 0; // No update was done
        }
    }

    @Override
    public int deleteStudent(int studentID) {
        // Step 1: Check if the student exists
        String checkQuery = "select count(*) from student where id=?";
        Integer count = jdbcTemplate.queryForObject(checkQuery, Integer.class, studentID);

        if (count != null && count > 0) {
            // Step 2: If student exists, delete the record
            String query = "delete from student where id=?";
            return jdbcTemplate.update(query, studentID);
        } else {
            System.out.println("❌ Error: No student found with ID " + studentID);
            return 0; // No delete was done
        }
    }

    @Override
    public Student getStudent(int studentID) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        return jdbcTemplate.queryForObject(query, rowMapper, studentID);
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        return jdbcTemplate.query(query, new RowMapperImpl());
    }
}