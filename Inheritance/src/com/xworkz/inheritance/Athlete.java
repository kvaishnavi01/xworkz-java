package com.xworkz.inheritance;

public class Athlete {
    public Athlete() {
        System.out.println("no args const of Athlete");
    }

    public void train() {
        System.out.println("Athlete is training");
    }

    public void warmUp() {
        System.out.println("Athlete is warming up");
    }

    public void compete() {
        System.out.println("Athlete is competing");
    }

    public void rest() {
        System.out.println("Athlete is resting");
    }

    public void hydrate() {
        System.out.println("Athlete is hydrating");
    }
}
