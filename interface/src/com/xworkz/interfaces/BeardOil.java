package com.xworkz.interfaces;

public interface BeardOil {
    void nourishBeard();
    void softenBeard();
    void promoteGrowth();
    default String getDescription() {
        return "This is a default method";
    }
}
