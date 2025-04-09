package com.xworkz.tostring;

public class Planet {
    private String name;
    private double diameter;
    private boolean hasRings;

    public Planet(String name, double diameter, boolean hasRings) {
        this.name = name;
        this.diameter = diameter;
        this.hasRings = hasRings;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " diameter is " + this.diameter + " km" +
                " has rings is " + this.hasRings;
    }
}
