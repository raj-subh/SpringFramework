package com.project.learn_spring.reference;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ReferenceMainClass {
    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("reference_config.xml");
            ClassA classA = (ClassA) context.getBean("ReferenceA");
            System.out.println(classA);
            context.close();

        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
