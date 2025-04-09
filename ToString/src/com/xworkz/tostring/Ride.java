package com.xworkz.tostring;

public class Ride {
    private String rideName;
    private double duration;
    private boolean isThrillRide;

    public Ride(String rideName, double duration, boolean isThrillRide) {
        this.rideName = rideName;
        this.duration = duration;
        this.isThrillRide = isThrillRide;
    }

    @Override
    public String toString() {
        return "ride is " + this.rideName + " duration is " + this.duration + " thrill ride is " + this.isThrillRide;
    }
}
