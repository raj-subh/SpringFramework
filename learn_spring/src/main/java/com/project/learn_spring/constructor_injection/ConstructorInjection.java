package com.project.learn_spring.constructor_injection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConstructorInjection {
    public static void main(String[] args) {
        System.out.println("Spring Project Starting...");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection_config.xml");
        // Person person = (Person) context.getBean("person1");
        // System.out.println(person);

        Addition addition1 = (Addition) context.getBean("add");
        addition1.doSum();
        context.close();
    }
}
