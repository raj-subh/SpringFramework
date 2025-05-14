package com.project.learn_spring;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringApplication.class, args);

		System.out.println("Spring Project Starting...");

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
			Student student1 = (Student) context.getBean("student1");
			Student student2 = (Student) context.getBean("student2");

			System.out.println(student1);
			System.out.println(student2);
			context.close();

		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
