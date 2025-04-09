package com.xworkz.tostring;

public class CoralReef {
    private String reefName;
    private String location;
    private int speciesCount;

    public CoralReef(String reefName, String location, int speciesCount) {
        this.reefName = reefName;
        this.location = location;
        this.speciesCount = speciesCount;
    }

    @Override
    public String toString() {
        return "reef name is " + this.reefName +
                " location is " + this.location +
                " species count is " + this.speciesCount;
    }
}
