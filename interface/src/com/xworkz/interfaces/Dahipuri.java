package com.xworkz.interfaces;

public interface Dahipuri {
    void addCurd();
    void sprinkleMasala();
    void plateUp();
    default String getDescription() {
        return "This is a default method";
    }
}
