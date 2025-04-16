package com.xworkz.interfaces;

public class DriverTeacher implements Driver, Teacher {
    public void drive() {
        System.out.println("Drives vehicles.");
    }

    public void checkFuel() {
        System.out.println("Checks fuel levels.");
    }

    public void collectFare() {
        System.out.println("Collects fare from passengers.");
    }

    public void teachSubject() {
        System.out.println("Teaches subjects to students.");
    }

    public void assignHomework() {
        System.out.println("Assigns homework.");
    }

    public void evaluateExam() {
        System.out.println("Evaluates student exams.");
    }
}
