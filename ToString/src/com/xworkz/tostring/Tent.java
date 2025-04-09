package com.xworkz.tostring;

public class Tent {
    private String color;
    private int capacity;
    private boolean isWaterproof;

    public Tent(String color, int capacity, boolean isWaterproof) {
        this.color = color;
        this.capacity = capacity;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "color is " + this.color + " capacity is " + this.capacity + " waterproof is " + this.isWaterproof;
    }
}
