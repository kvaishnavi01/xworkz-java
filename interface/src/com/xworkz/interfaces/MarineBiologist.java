package com.xworkz.interfaces;

public class MarineBiologist implements ResearchScientist {
    public void conductResearch() {
        System.out.println("Conducts research on marine life.");
    }
    public void publishPapers() {
        System.out.println("Publishes research papers in marine biology.");
    }
    public void presentFindings() {
        System.out.println("Presents research findings at conferences.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
