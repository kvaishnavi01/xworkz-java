package com.xworkz.interfaces;

public interface Blush {
    void applyColor();
    void blend();
    void highlightCheeks();
    default String getDescription() {
        return "This is a default method";
    }
}
