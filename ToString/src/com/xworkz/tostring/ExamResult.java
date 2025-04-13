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

    @Override
    public int hashCode(){
        return 44;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof ExamResult) {
                System.out.println("will compare.....");
                ExamResult r1 = this;
                ExamResult r2 = (ExamResult) obj;
                if(r1.subject.equals(r2.subject) && r1.marks == r2.marks) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
