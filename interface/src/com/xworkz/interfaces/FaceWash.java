package com.xworkz.interfaces;

public interface FaceWash {
    void removeDirt();
    void refreshSkin();
    void controlOil();
    default String getDescription() {
        return "This is a default method";
    }
}
