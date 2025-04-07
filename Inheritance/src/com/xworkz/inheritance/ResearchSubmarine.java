package com.xworkz.inheritance;

public class ResearchSubmarine extends Submarine {
    public ResearchSubmarine() {
        System.out.println("no args const of ResearchSubmarine");
    }

    @Override
    public void dive() {
        System.out.println("ResearchSubmarine dives to deep ocean levels");
    }

    @Override
    public void surface() {
        System.out.println("ResearchSubmarine surfaces after data collection");
    }

    @Override
    public void navigate() {
        System.out.println("ResearchSubmarine navigates using advanced sensors");
    }

    @Override
    public void communicate() {
        System.out.println("ResearchSubmarine sends data via encrypted signals");
    }

    @Override
    public void maintainPressure() {
        System.out.println("ResearchSubmarine maintains high-pressure tolerance");
    }

    public void collectSamples() {
        System.out.println("ResearchSubmarine collects marine samples");
    }
}
