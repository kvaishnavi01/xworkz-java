package com.xworkz.inheritance;

public class EmpathySimulator extends EmotionEngine {
    public EmpathySimulator() {
        System.out.println("no args const of EmpathySimulator");
    }

    @Override
    public void detectInput() {
        System.out.println("EmpathySimulator senses subtle emotional cues");
    }

    @Override
    public void evaluateState() {
        System.out.println("EmpathySimulator maps emotion to empathy index");
    }

    @Override
    public void adjustOutput() {
        System.out.println("EmpathySimulator modulates tone and gesture in output");
    }

    @Override
    public void simulateResponse() {
        System.out.println("EmpathySimulator generates human-like emotional feedback");
    }

    @Override
    public void logEmotion() {
        System.out.println("EmpathySimulator creates empathy history logs");
    }
}
