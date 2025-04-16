package com.xworkz.interfaces;

public class HighSchoolTeacher implements Teacher {
    public void teachSubject() {
        System.out.println("Teaches high school subject.");
    }
    public void assignHomework() {
        System.out.println("Assigns homework to students.");
    }
    public void evaluateExam() {
        System.out.println("Evaluates student exams.");
    }
}
