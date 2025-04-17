package com.xworkz.interfaces;

public interface Firefighter {
    void extinguishFire();
    void performRescue();
    void inspectFireHazards();
    default String getDescription() {
        return "This is a default method";
    }
}
