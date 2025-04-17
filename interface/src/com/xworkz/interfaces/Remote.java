package com.xworkz.interfaces;

public interface Remote {
    void turnOn();
    void turnOff();
    void changeChannel();
    default String getDescription() {
        return "This is a default method";
    }
}
