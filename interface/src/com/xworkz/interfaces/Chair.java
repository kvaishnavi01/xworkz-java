package com.xworkz.interfaces;

public interface Chair {
    void sit();
    void recline();
    void roll();
    default String getDescription() {
        return "This is a default method";
    }
}
