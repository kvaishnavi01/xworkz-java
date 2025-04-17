package com.xworkz.interfaces;

public interface FaceScrub {
    void exfoliate();
    void unclogPores();
    void brightenSkin();
    default String getDescription() {
        return "This is a default method";
    }
}
