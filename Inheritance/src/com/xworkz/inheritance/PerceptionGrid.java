package com.xworkz.inheritance;

public class PerceptionGrid {
    public PerceptionGrid() {
        System.out.println("no args const of PerceptionGrid");
    }

    public void receiveVisuals() {
        System.out.println("PerceptionGrid receives raw visual input");
    }

    public void detectPatterns() {
        System.out.println("PerceptionGrid detects patterns in environment");
    }

    public void trackMotion() {
        System.out.println("PerceptionGrid tracks movement across field of vision");
    }

    public void mapEnvironment() {
        System.out.println("PerceptionGrid maps physical surroundings");
    }

    public void adjustSensitivity() {
        System.out.println("PerceptionGrid adjusts sensory thresholds");
    }
}
