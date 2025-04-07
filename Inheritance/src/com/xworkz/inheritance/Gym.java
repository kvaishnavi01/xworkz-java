package com.xworkz.inheritance;

public class Gym {
    public void conduct(Trainer trainer) {
        trainer.giveInstructions();
        trainer.scheduleSessions();
        trainer.motivate();
        trainer.monitorProgress();
        trainer.giveFeedback();

        if (trainer instanceof FitnessTrainer) {
            FitnessTrainer fit = (FitnessTrainer) trainer;
            fit.demonstrateExercise();
        }
    }
}
