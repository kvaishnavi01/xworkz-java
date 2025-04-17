package com.xworkz.interfaces;

public interface Foundation {
    void matchSkinTone();
    void provideCoverage();
    void stayLong();
    default String getDescription() {
        return "This is a default method";
    }
}
