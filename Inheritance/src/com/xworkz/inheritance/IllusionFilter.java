package com.xworkz.inheritance;

public class IllusionFilter extends PerceptionGrid {
    public IllusionFilter() {
        System.out.println("no args const of IllusionFilter");
    }

    @Override
    public void receiveVisuals() {
        System.out.println("IllusionFilter intercepts visuals and modifies context");
    }

    @Override
    public void detectPatterns() {
        System.out.println("IllusionFilter projects false patterns into perception");
    }

    @Override
    public void trackMotion() {
        System.out.println("IllusionFilter creates illusions of phantom movement");
    }

    @Override
    public void mapEnvironment() {
        System.out.println("IllusionFilter renders distorted versions of space");
    }

    @Override
    public void adjustSensitivity() {
        System.out.println("IllusionFilter manipulates thresholds to enhance illusion");
    }
}
