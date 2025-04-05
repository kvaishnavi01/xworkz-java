package com.xworkz.inheritance;

public class FitnessTrainer extends Trainer {
    public FitnessTrainer() {
        System.out.println("no args const of FitnessTrainer");
    }

    @Override
    public void planSchedule() {
        System.out.println("Fitness trainer creates a custom gym plan");
    }

    @Override
    public void conductSession() {
        System.out.println("Fitness trainer is leading a HIIT session");
    }

    @Override
    public void motivateClient() {
        System.out.println("Fitness trainer is pushing the client to do more reps");
    }

    @Override
    public void trackProgress() {
        System.out.println("Fitness trainer is tracking body measurements");
    }

    @Override
    public void giveFeedback() {
        System.out.println("Fitness trainer is correcting posture and form");
    }
}
