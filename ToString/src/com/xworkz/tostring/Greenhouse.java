package com.xworkz.tostring;

public class Greenhouse {
    private String location;
    private int plantCount;
    private boolean hasIrrigationSystem;

    public Greenhouse(String location, int plantCount, boolean hasIrrigationSystem) {
        this.location = location;
        this.plantCount = plantCount;
        this.hasIrrigationSystem = hasIrrigationSystem;

    }

    @Override
    public String toString() {
        return "location is " + this.location +
                " plant count is " + this.plantCount +
                " irrigation system is " + this.hasIrrigationSystem;
    }
}
