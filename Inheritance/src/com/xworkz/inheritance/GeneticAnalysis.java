package com.xworkz.inheritance;

public class GeneticAnalysis {
    public void examine(Organism organism) {
        organism.grow();
        organism.reproduce();
        organism.metabolize();
        organism.move();
        organism.respondToStimuli();

        if (organism instanceof MutantOrganism) {
            MutantOrganism mutant = (MutantOrganism) organism;
            mutant.mutate();
        }
    }
}
