package com.project.learn_spring02.JavaDatabaseConnectivity;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.learn_spring02.JavaDatabaseConnectivity.Dao.StudentRepository;
import com.project.learn_spring02.JavaDatabaseConnectivity.Dao.Entities.Student;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		System.out.println("Spring JDBC Project Starting...");

		// Get the StudentRepository Bean from the Spring Context
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		// Creating a new student object
		// Student student = new Student(265, "Rounak", "Kolkata");

		// Creating a new student object
		Student student1 = new Student();
		student1.setId(250);
		student1.setName("Rahish Raj");
		student1.setCity("Asanghatta");

		// // Inserting student data
		// int result = studentRepository.insert(student);
		// System.out.println("Student Added, Rows affected: " + result);

		// Updating student details
		// int result1 = studentRepository.updateStudent(student1);
		// System.out.println("Student Updated, Rows affected: " + result1);

		// Deleting student details using id
		// int result2 = studentRepository.deleteStudent(255);
		// System.out.println("Student Deletd, Rows affected: " + result2);

		// Select student
		// Student student = studentRepository.getStudent(256);
		// System.out.println(student);

		// Select all student at once
		List<Student> students = studentRepository.getAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
