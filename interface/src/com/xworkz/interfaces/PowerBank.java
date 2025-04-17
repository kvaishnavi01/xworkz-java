package com.xworkz.interfaces;

public interface PowerBank {
    void chargeDevice();
    void checkBattery();
    void turnOff();
    default String getDescription() {
        return "This is a default method";
    }
}
