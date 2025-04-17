package com.xworkz.interfaces;

public interface Bottle {
    void fillWater();
    void drinkWater();
    void recycle();
    default String getDescription() {
        return "This is a default method";
    }
}
