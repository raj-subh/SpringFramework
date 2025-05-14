package com.project.learn_spring.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class LifeCycleAnnotations {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LifeCycleAnnotations() {
        super();
    }

    @Override
    public String toString() {
        return "LifeCycleAnnotations [subject=" + subject + "]";
    }

    @PostConstruct
    public void start() {
        System.out.println("Starting method...");
    }

    @PreDestroy
    public void end() {
        System.out.println("Ending method...");
    }
}
