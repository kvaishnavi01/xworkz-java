package com.xworkz.tostring;

public class Volcano {
    private String name;
    private double height;
    private boolean isActive;

    public Volcano(String name, double height, boolean isActive) {
        this.name = name;
        this.height = height;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " height is " + this.height + " meters" +
                " active is " + this.isActive;
    }
}
