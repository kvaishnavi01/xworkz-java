package com.xworkz.interfaces;

public interface Highlighter {
    void addGlow();
    void applyAboveCheeks();
    void reflectLight();
    default String getDescription() {
        return "This is a default method";
    }
}
