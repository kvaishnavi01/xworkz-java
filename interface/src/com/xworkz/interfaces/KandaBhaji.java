package com.xworkz.interfaces;

public interface KandaBhaji {
    void sliceOnions();
    void coatWithBesan();
    void deepFry();
    default String getDescription() {
        return "This is a default method";
    }
}
