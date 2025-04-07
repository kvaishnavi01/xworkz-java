package com.xworkz.inheritance;

public class FitnessTrainer extends Trainer {
    public FitnessTrainer() {
        System.out.println("no args const of FitnessTrainer");
    }

    @Override
    public void giveInstructions() {
        System.out.println("Fitness Trainer gives workout instructions");
    }

    @Override
    public void scheduleSessions() {
        System.out.println("Fitness Trainer schedules gym workouts");
    }

    @Override
    public void motivate() {
        System.out.println("Fitness Trainer pushes clients to reach goals");
    }

    @Override
    public void monitorProgress() {
        System.out.println("Fitness Trainer tracks weight and strength changes");
    }

    @Override
    public void giveFeedback() {
        System.out.println("Fitness Trainer advises on diet and improvements");
    }

    public void demonstrateExercise() {
        System.out.println("Fitness Trainer demonstrates exercises");
    }
}
