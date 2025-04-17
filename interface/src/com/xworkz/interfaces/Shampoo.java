package com.xworkz.interfaces;

public interface Shampoo {
    void cleanseHair();
    void addFragrance();
    void strengthenRoots();
    default String getDescription() {
        return "This is a default method";
    }
}
