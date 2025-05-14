package com.project.learn_spring.standalone.collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class StandaloneCollection {
    public static void main(String[] args) {
        SpringApplication.run(StandaloneCollection.class, args);
        System.out.println("Spring Project Starting...");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("standaloneCollection_config.xml");
        Person person1 = context.getBean("person1", Person.class);

        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());

        System.out.println("--------------------------------------------------------------------");

        System.out.println(person1.getFeeDetails());
        System.out.println(person1.getFeeDetails().getClass().getName());

        System.out.println("--------------------------------------------------------------------");

        System.out.println(person1.getProperties());
        System.out.println(person1.getProperties().getClass().getName());
        context.close();
    }
}
