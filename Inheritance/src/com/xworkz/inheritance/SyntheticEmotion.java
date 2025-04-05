package com.xworkz.inheritance;

public class SyntheticEmotion extends Emotion {
    public SyntheticEmotion() {
        System.out.println("no args const of SyntheticEmotion");
    }

    @Override
    public void express() {
        System.out.println("SyntheticEmotion mimics emotional expressions");
    }

    @Override
    public void fluctuate() {
        System.out.println("SyntheticEmotion adjusts based on programmed parameters");
    }

    @Override
    public void influenceThoughts() {
        System.out.println("SyntheticEmotion triggers logic-based behavioral patterns");
    }

    @Override
    public void connectWithOthers() {
        System.out.println("SyntheticEmotion creates calculated bonding with users");
    }

    @Override
    public void fadeOverTime() {
        System.out.println("SyntheticEmotion resets after evaluation cycle");
    }
}
