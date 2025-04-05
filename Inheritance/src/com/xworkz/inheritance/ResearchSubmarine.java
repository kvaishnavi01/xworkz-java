package com.xworkz.inheritance;

public class ResearchSubmarine extends Submarine {
    public ResearchSubmarine() {
        System.out.println("no args const of ResearchSubmarine");
    }

    @Override
    public void dive() {
        System.out.println("Research submarine dives to explore ocean floor");
    }

    @Override
    public void surface() {
        System.out.println("Research submarine surfaces after data collection");
    }

    @Override
    public void navigate() {
        System.out.println("Research submarine uses advanced sonar mapping");
    }

    @Override
    public void maintainPressure() {
        System.out.println("Research submarine maintains lab-safe pressure levels");
    }

    @Override
    public void communicate() {
        System.out.println("Research submarine sends real-time data to research stations");
    }
}
