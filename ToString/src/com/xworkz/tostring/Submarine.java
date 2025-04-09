package com.xworkz.tostring;

public class Submarine {
    private String name;
    private double depthLimit;
    private boolean nuclearPowered;

    public Submarine(String name, double depthLimit, boolean nuclearPowered) {
        this.name = name;
        this.depthLimit = depthLimit;
        this.nuclearPowered = nuclearPowered;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " depth limit is " + this.depthLimit + " meters" +
                " nuclear powered is " + this.nuclearPowered;
    }
}
