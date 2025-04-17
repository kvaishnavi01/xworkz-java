package com.xworkz.interfaces;

public interface Driver {
    void drive();
    void checkFuel();
    void collectFare();
    default String getDescription() {
        return "This is a default method";
    }
}
