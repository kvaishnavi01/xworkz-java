package com.xworkz.interfaces;

public interface Laptop {
    void bootUp();
    void runProgram();
    void shutDown();

    default String getDescription() {
        return "This is a default method";
    }
}
