package com.xworkz.tostring;

public class Stapler {
    private String model;
    private int pinCapacity;
    private boolean isMetalBody;

    public Stapler(String model, int pinCapacity, boolean isMetalBody) {
        this.model = model;
        this.pinCapacity = pinCapacity;
        this.isMetalBody = isMetalBody;
    }

    @Override
    public String toString() {
        return "model is " + this.model + " pin capacity is " + this.pinCapacity + " metal body is " + this.isMetalBody;
    }
}
