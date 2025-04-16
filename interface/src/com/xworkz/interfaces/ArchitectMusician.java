package com.xworkz.interfaces;

public class ArchitectMusician implements Architect, Musician {
    public void designBuilding() {
        System.out.println("Designs blueprints for buildings.");
    }

    public void createBlueprint() {
        System.out.println("Creates detailed blueprints for construction.");
    }

    public void inspectConstruction() {
        System.out.println("Inspects ongoing construction.");
    }

    public void playInstrument() {
        System.out.println("Plays a musical instrument.");
    }

    public void composeSong() {
        System.out.println("Composes original music.");
    }

    public void attendRehearsal() {
        System.out.println("Attends band rehearsals.");
    }
}
