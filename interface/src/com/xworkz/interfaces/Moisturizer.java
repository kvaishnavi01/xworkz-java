package com.xworkz.interfaces;

public interface Moisturizer {
    void lockMoisture();
    void healSkin();
    void preventDryness();
    default String getDescription() {
        return "This is a default method";
    }
}
