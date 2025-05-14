package com.project.learn_spring01.strereotype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ImportResource("stereotype_config.xml")
@SpringBootApplication
public class TestStereotype {
    public static void main(String[] args) {
        SpringApplication.run(TestStereotype.class, args);
        System.out.println("Starting Spring Project...");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("stereotype_config.xml");
        Student student = context.getBean("studentObj", Student.class);

        System.out.println(student);
        System.out.println("----------------------------------------------------");
        System.out.println(student.getAddress());
        System.out.println("----------------------------------------------------");
        System.out.println(student.getAddress().getClass().getName());
        System.out.println("----------------------------------------------------");
        System.out.println(student.hashCode());
        System.out.println("----------------------------------------------------");
        Student student1 = context.getBean("studentObj", Student.class);
        System.out.println(student1.hashCode());

        // Checking prototyping in spring (Singleton & Prototype)
        Teacher teacher1 = context.getBean("teacher", Teacher.class);
        Teacher teacher2 = context.getBean("teacher", Teacher.class);

        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        context.close();
    }
}
