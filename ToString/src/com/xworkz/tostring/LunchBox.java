package com.xworkz.tostring;

public class LunchBox {
    private String shape;
    private int compartments;
    private boolean isMicrowaveSafe;

    public LunchBox(String shape, int compartments, boolean isMicrowaveSafe) {
        this.shape = shape;
        this.compartments = compartments;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "shape is " + this.shape + " compartments are " + this.compartments + " microwave safe is " + this.isMicrowaveSafe;
    }
}
