package com.xworkz.interfaces;

public interface Mouse {
    void click();
    void scroll();
    void connectToPC();
    default String getDescription() {
        return "This is a default method";
    }
}
