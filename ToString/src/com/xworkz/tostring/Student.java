package com.xworkz.tostring;

public class Student {
    private String name;
    private int rollNumber;
    private double percentage;

    public Student(String name, int rollNumber, double percentage) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " roll number is " + this.rollNumber + " percentage is " + this.percentage;
    }
}
