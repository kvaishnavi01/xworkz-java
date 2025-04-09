package com.xworkz.tostring;

public class Spacesuit {
    private String model;
    private int oxygenCapacity;
    private boolean radiationShield;

    public Spacesuit(String model, int oxygenCapacity, boolean radiationShield) {
        this.model = model;
        this.oxygenCapacity = oxygenCapacity;
        this.radiationShield = radiationShield;
    }

    @Override
    public String toString() {
        return "model is " + this.model +
                " oxygen capacity is " + this.oxygenCapacity + " minutes" +
                " radiation shield is " + this.radiationShield;
    }
}
