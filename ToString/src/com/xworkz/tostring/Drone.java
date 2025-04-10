package com.xworkz.tostring;

public class Drone {
    private String model;
    private int flightTime;
    private boolean hasCamera;

    public Drone(String model, int flightTime, boolean hasCamera) {
        this.model = model;
        this.flightTime = flightTime;
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString() {
        return "model is " + this.model +
                " flight time is " + this.flightTime + " mins" +
                " camera included is " + this.hasCamera;
    }
    @Override
    public int hashCode(){
        return 25;
    }
}
