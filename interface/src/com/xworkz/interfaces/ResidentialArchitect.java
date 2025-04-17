package com.xworkz.interfaces;

public class ResidentialArchitect implements Architect {
    public void designBuilding() {
        System.out.println("Designs residential buildings.");
    }
    public void createBlueprint() {
        System.out.println("Creates blueprints for buildings.");
    }
    public void inspectConstruction() {
        System.out.println("Inspects construction progress.");
    }
    public String getDescription() {
        return "Designing and overseeing building construction.";
    }
}
