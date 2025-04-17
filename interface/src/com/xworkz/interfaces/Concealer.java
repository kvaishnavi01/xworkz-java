package com.xworkz.interfaces;

public interface Concealer {
    void hideSpots();
    void blendWithSkin();
    void brightenUnderEyes();
    default String getDescription() {
        return "This is a default method";
    }
}
