package com.project.learn_spring01.javaConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainDemo {
    public static void main(String[] args) {
        SpringApplication.run(MainDemo.class, args);
        System.out.println("Spring Project Starting...");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Student student1 = context.getBean("student", Student.class);

        // System.out.println(student1);
        student1.study();

        context.close();
    }
}
