package com.xworkz.interfaces;

public interface SmartWatch {
    void trackSteps();
    void showNotifications();
    void measureHeartRate();
    default String getDescription() {
        return "This is a default method";
    }
}
