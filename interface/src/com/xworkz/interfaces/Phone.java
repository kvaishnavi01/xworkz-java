package com.xworkz.interfaces;

public interface Phone {
    void makeCall();
    void receiveCall();
    void charge();
    default String getDescription() {
        return "This is a default method";
    }
}
