package com.xworkz.inheritance;

public class Organism {
    public Organism() {
        System.out.println("no args const of Organism");
    }

    public void grow() {
        System.out.println("Organism is growing");
    }

    public void reproduce() {
        System.out.println("Organism is reproducing");
    }

    public void metabolize() {
        System.out.println("Organism is metabolizing");
    }

    public void move() {
        System.out.println("Organism is moving");
    }

    public void respondToStimuli() {
        System.out.println("Organism responds to stimuli");
    }
}
