package com.xworkz.interfaces;

public class FitnessTrainer implements PersonalTrainer {
    public void createWorkoutPlan() {
        System.out.println("Creates personalized workout plans.");
    }
    public void demonstrateExercises() {
        System.out.println("Demonstrates exercises to clients.");
    }
    public void monitorProgress() {
        System.out.println("Monitors client progress and adjusts plans.");
    }
}
