package com.project.learn_spring01.springExpressionLanguage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestSpEL {
    public static void main(String[] args) {
        SpringApplication.run(TestSpEL.class, args);
        System.out.println("Starting Spring Project...");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpEL_config.xml");
        Demo demo1 = context.getBean("demo", Demo.class);

        System.out.println(demo1);
        context.close();
    }
}
