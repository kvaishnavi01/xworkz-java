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
    public int hashCode() {
        return 65;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Exam) {
                System.out.println("will compare.....");
                Exam e1 = this;
                Exam e2 = (Exam) obj;
                if (e1.subject.equals(e2.subject) && e1.totalMarks == e2.totalMarks && e1.grade == e2.grade) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
