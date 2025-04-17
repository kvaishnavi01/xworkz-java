package com.xworkz.interfaces;

public interface Monitor {
    void displayOutput();
    void changeBrightness();
    void powerOff();
    default String getDescription() {
        return "This is a default method";
    }
}
