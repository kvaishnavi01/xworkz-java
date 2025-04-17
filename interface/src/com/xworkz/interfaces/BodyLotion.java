package com.xworkz.interfaces;

public interface BodyLotion {
    void hydrateSkin();
    void smoothenTexture();
    void repairDryness();
    default String getDescription() {
        return "This is a default method";
    }
}
