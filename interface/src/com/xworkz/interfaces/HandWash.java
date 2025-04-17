package com.xworkz.interfaces;

public interface HandWash {
    void killGerms();
    void moisturizeHands();
    void leaveFragrance();
    default String getDescription() {
        return "This is a default method";
    }
}
