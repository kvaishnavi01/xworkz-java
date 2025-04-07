package com.xworkz.inheritance;

public class Runner extends Athlete {
    public Runner() {
        System.out.println("no args const of Runner");
    }

    @Override
    public void train() {
        System.out.println("Runner is doing endurance training");
    }

    @Override
    public void warmUp() {
        System.out.println("Runner is warming up with stretches");
    }

    @Override
    public void compete() {
        System.out.println("Runner is competing in a marathon");
    }

    @Override
    public void rest() {
        System.out.println("Runner is resting after a race");
    }

    @Override
    public void hydrate() {
        System.out.println("Runner is drinking electrolyte water");
    }

    public void run(){
        System.out.println("runner runs");
    }
}
