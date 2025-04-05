package com.xworkz.inheritance;

public class MutantOrganism extends Organism {
    public MutantOrganism() {
        System.out.println("no args const of MutantOrganism");
    }

    @Override
    public void grow() {
        System.out.println("Mutant organism grows at an accelerated rate");
    }

    @Override
    public void reproduce() {
        System.out.println("Mutant organism reproduces with unpredictable mutations");
    }

    @Override
    public void respondToStimuli() {
        System.out.println("Mutant organism responds with enhanced senses");
    }

    @Override
    public void consumeEnergy() {
        System.out.println("Mutant organism consumes unusual energy sources");
    }

    @Override
    public void adapt() {
        System.out.println("Mutant organism adapts instantly to hostile environments");
    }
}
