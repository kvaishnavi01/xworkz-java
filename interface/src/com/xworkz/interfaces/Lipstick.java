package com.xworkz.interfaces;

public interface Lipstick {
    void twistOpen();
    void applyOnLips();
    void sealColor();
    default String getDescription() {
        return "This is a default method";
    }
}
