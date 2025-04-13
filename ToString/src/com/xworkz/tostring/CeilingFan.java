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
    public int hashCode() {
        return 83;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof CeilingFan) {
                System.out.println("will compare.....");
                CeilingFan f1 = this;
                CeilingFan f2 = (CeilingFan) obj;
                if (f1.color.equals(f2.color) && f1.speedLevels == f2.speedLevels && f1.isRemoteControlled == f2.isRemoteControlled) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
