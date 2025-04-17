package com.xworkz.interfaces;

public interface HairGel {
    void styleHair();
    void provideHold();
    void addTexture();
    default String getDescription() {
        return "This is a default method";
    }
}
