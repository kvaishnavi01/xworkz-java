package com.xworkz.interfaces;

public interface Charger {
    void plugIn();
    void startCharging();
    void stopCharging();
    default String getDescription() {
        return "This is a default method";
    }
}
