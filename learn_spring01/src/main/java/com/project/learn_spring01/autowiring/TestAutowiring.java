package com.project.learn_spring01.autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.project.learn_spring01.LearnSpring01Application;

@SpringBootApplication
public class TestAutowiring {
    public static void main(String[] args) {
        SpringApplication.run(LearnSpring01Application.class, args);
        System.out.println("Spring Project Starting...");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring_config.xml");
        Employee employee = context.getBean("employee4", Employee.class);

        System.out.println(employee);
        context.close();
    }
}
