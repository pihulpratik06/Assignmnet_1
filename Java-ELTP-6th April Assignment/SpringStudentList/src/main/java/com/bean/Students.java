package com.bean;

public class Students {
     private String name;
     private int studentID;
     private double percentage;
     private String degree;

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", percentage=" + percentage +
                ", degree='" + degree + '\'' +
                '}';
    }
}
