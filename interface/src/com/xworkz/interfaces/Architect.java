package com.xworkz.interfaces;

public interface Architect {
    void designBuilding();
    void createBlueprint();
    void inspectConstruction();
    default String getDescription() {
        return "Designing and overseeing building construction.";
    }
}
