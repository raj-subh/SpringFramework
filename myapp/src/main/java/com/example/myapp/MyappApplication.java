package com.example.myapp;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);

		System.out.println("Starting Project...");

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml")) {
			Student student2 = (Student) context.getBean("student1");
			System.out.println(student2);

		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
