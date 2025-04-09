package com.xworkz.tostring;

public class ExamResult {
    private String subject;
    private int marks;
    private char grade;

    public ExamResult(String subject, int marks, char grade) {
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "subject is " + this.subject + " marks are " + this.marks + " grade is " + this.grade;
    }
}
