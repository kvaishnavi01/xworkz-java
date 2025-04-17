package com.xworkz.interfaces;

public interface Mug {
    void fill();
    void drink();
    void wash();
    default String getDescription() {
        return "This is a default method";
    }
}
