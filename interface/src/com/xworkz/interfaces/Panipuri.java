package com.xworkz.interfaces;

public interface Panipuri {
    void prepareWater();
    void fillPuri();
    void serve();
    default String getDescription() {
        return "This is a default method";
    }
}
