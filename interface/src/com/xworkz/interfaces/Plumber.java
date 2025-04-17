package com.xworkz.interfaces;

public interface Plumber {
    void fixLeak();
    void installPipes();
    void inspectDrains();
    default String getDescription() {
        return "This is a default method";
    }
}
