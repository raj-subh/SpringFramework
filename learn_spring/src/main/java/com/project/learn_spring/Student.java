package com.project.learn_spring;

public class Student {
    private int studentID;
    private String studentName;
    private String studentAddress;

    public void setStudentID(int studentID) {
        System.out.println("Setting Student ID...");
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentName(String studentName) {
        System.out.println("Setting Student Name...");
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setstudentAddress(String studentAddress) {
        System.out.println("Setting Student Address...");
        this.studentAddress = studentAddress;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public Student() {
        super();
    }

    public Student(int studentID, String studentName, String studentAddress) {
        super();
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + "]";
    }
}
