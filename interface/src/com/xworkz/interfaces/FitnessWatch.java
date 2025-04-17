package com.xworkz.interfaces;

public class FitnessWatch implements SmartWatch {
    public void trackSteps() {
        System.out.println("Tracking steps on smart watch.");
    }

    public void showNotifications() {
        System.out.println("Displaying notifications on smart watch.");
    }

    public void measureHeartRate() {
        System.out.println("Measuring heart rate.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
