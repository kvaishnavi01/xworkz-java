package com.xworkz.interfaces;

public class DailyMoisturizer implements Moisturizer {
    public void lockMoisture() {
        System.out.println("Locks moisture into the skin all day.");
    }
    public void healSkin() {
        System.out.println("Heals rough and dry patches.");
    }
    public void preventDryness() {
        System.out.println("Prevents skin from drying out.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
