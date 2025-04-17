package com.xworkz.interfaces;

public interface Eyeliner {
    void drawLine();
    void defineEyes();
    void dryQuickly();
    default String getDescription() {
        return "This is a default method";
    }
}
