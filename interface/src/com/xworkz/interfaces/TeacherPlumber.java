package com.xworkz.interfaces;

public class TeacherPlumber implements Teacher, Plumber {
    public void teachSubject() {
        System.out.println("Teaches the subject to students.");
    }

    public void assignHomework() {
        System.out.println("Assigns homework to students.");
    }

    public void evaluateExam() {
        System.out.println("Evaluates students' exams.");
    }

    public void fixLeak() {
        System.out.println("Fixes water leakages.");
    }

    public void installPipes() {
        System.out.println("Installs plumbing pipes.");
    }

    public void inspectDrains() {
        System.out.println("Inspects and cleans drains.");
    }
}
