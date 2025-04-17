package com.xworkz.interfaces;

public interface PersonalTrainer {
    void createWorkoutPlan();
    void demonstrateExercises();
    void monitorProgress();
    default String getDescription() {
        return "This is a default method";
    }
}
