package com.xworkz.interfaces;

public class ChefTeacher implements Chef, Teacher {
    public void cook() {
        System.out.println("Cooks delicious meals.");
    }

    public void planMenu() {
        System.out.println("Plans the meal menu.");
    }

    public void manageKitchen() {
        System.out.println("Manages the kitchen operations.");
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
