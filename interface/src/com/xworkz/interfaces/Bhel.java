package com.xworkz.interfaces;

public interface Bhel {
    void mixPuffedRice();
    void addVeggies();
    void squeezeLemon();
    default String getDescription() {
        return "This is a default method";
    }
}
