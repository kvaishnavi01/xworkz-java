package com.xworkz.inheritance;

public class MutantOrganism extends Organism {
    public MutantOrganism() {
        System.out.println("no args const of MutantOrganism");
    }

    @Override
    public void grow() {
        System.out.println("MutantOrganism grows rapidly");
    }

    @Override
    public void reproduce() {
        System.out.println("MutantOrganism reproduces with genetic variations");
    }

    @Override
    public void metabolize() {
        System.out.println("MutantOrganism has enhanced metabolism");
    }

    @Override
    public void move() {
        System.out.println("MutantOrganism moves in unpredictable ways");
    }

    @Override
    public void respondToStimuli() {
        System.out.println("MutantOrganism reacts intensely to stimuli");
    }

    public void mutate() {
        System.out.println("MutantOrganism is undergoing mutation");
    }
}
