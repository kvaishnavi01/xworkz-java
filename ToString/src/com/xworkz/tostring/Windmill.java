package com.xworkz.tostring;

public class Windmill {
    private String location;
    private double bladeLength;
    private int energyOutput;

    public Windmill(String location, double bladeLength, int energyOutput) {
        this.location = location;
        this.bladeLength = bladeLength;
        this.energyOutput = energyOutput;
    }

    @Override
    public String toString() {
        return "location is " + this.location +
                " blade length is " + this.bladeLength + " meters" +
                " energy output is " + this.energyOutput + " kW";
    }
}
