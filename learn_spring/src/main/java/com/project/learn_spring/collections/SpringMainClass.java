package com.project.learn_spring.collections;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringMainClass {
    public static void main(String[] args) {
        System.out.println("Running Spring Project...");

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("collection_config.xml");
            Employee employee1 = (Employee) context.getBean("Employee1");
            System.out.println(employee1);
            System.out.println(employee1.getPhones().getClass().getName());
            context.close();

        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
