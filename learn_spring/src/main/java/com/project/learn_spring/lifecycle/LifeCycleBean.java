package com.project.learn_spring.lifecycle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LifeCycleBean {
    public static void main(String[] args) {
        System.out.println("Spring Project Starting...");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_config.xml");
        context.registerShutdownHook();

        // Sweets sweets = (Sweets) context.getBean("sweet1");
        // System.out.println(sweets);

        Drinks drinks = (Drinks) context.getBean("pepsi1");
        System.out.println(drinks);

        context.close();
    }
}
