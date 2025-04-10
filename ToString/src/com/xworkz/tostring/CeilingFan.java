package com.xworkz.tostring;

public class CeilingFan {
    private String color;
    private int speedLevels;
    private boolean isRemoteControlled;

    public CeilingFan(String color, int speedLevels, boolean isRemoteControlled) {
        this.color = color;
        this.speedLevels = speedLevels;
        this.isRemoteControlled = isRemoteControlled;
    }

    @Override
    public String toString() {
        return "color is " + this.color + " speed levels are " + this.speedLevels + " remote controlled is " + this.isRemoteControlled;
    }
    @Override
    public int hashCode(){
        return 83;
    }
}
