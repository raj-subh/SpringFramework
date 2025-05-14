package com.project.learn_spring01.javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.project.learn_spring01.javaConfiguration")
public class JavaConfiguration {

    @Bean
    Samosa getSamosa() {
        return new Samosa();
    }

    @Bean(name = { "student", "temp" })
    Student getStudent() {
        Student student = new Student(getSamosa());
        return student;
    }
}