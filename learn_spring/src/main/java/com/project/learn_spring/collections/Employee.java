package com.project.learn_spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> courses;
    private Properties job_type;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setProps(Properties job_type) {
        this.job_type = job_type;
    }

    public Properties getProps() {
        return job_type;
    }

    public Employee() {
        super();
    }

    public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        super();
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses
                + ", Job Type=" + job_type + "]";
    }
}
