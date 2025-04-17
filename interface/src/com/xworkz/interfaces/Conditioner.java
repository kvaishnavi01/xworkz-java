package com.xworkz.interfaces;

public interface Conditioner {
    void softenHair();
    void reduceFrizz();
    void addShine();
    default String getDescription() {
        return "This is a default method";
    }
}
