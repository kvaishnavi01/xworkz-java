package com.xworkz.tostring;

public class Exam {
    private String subject;
    private int totalMarks;
    private char grade;

    public Exam(String subject, int totalMarks, char grade) {
        this.subject = subject;
        this.totalMarks = totalMarks;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "subject is " + this.subject + " marks are " + this.totalMarks + " grade is " + this.grade;
    }
    @Override
    public int hashCode(){
        return 65;
    }
}
