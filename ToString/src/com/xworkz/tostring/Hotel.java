package com.xworkz.tostring;

public class Hotel {
    private String name;
    private int stars;
    private boolean hasWifi;

    public Hotel(String name, int stars, boolean hasWifi) {
        this.name = name;
        this.stars = stars;
        this.hasWifi = hasWifi;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " stars are " + this.stars + " wifi is " + this.hasWifi;
    }
}
