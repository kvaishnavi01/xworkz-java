package com.xworkz.interfaces;

public interface Mascara {
    void liftLashes();
    void addVolume();
    void waterproofEffect();
    default String getDescription() {
        return "This is a default method";
    }
}
