package com.xworkz.tostring;

public class Ball {
    private String sport;
    private double diameter;
    private boolean isIndoor;

    public Ball(String sport, double diameter, boolean isIndoor) {
        this.sport = sport;
        this.diameter = diameter;
        this.isIndoor = isIndoor;
    }

    @Override
    public String toString() {
        return "sport is " + this.sport + " diameter is " + this.diameter + " indoor is " + this.isIndoor;

    }
}