package com.xworkz.inheritance;

public class SyntheticEmotion extends Emotion {
    public SyntheticEmotion() {
        System.out.println("no args const of SyntheticEmotion");
    }

    @Override
    public void expressJoy() {
        System.out.println("SyntheticEmotion simulates joy using AI");
    }

    @Override
    public void expressSadness() {
        System.out.println("SyntheticEmotion simulates sadness with neural feedback");
    }

    @Override
    public void expressAnger() {
        System.out.println("SyntheticEmotion mimics anger using data analysis");
    }

    @Override
    public void expressFear() {
        System.out.println("SyntheticEmotion replicates fear from environment input");
    }

    @Override
    public void expressSurprise() {
        System.out.println("SyntheticEmotion generates surprise through logic triggers");
    }

    public void calibrateEmotionModel() {
        System.out.println("SyntheticEmotion calibrates emotional response algorithm");
    }
}
