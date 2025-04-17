package com.xworkz.interfaces;

public interface Earpods {
    void connectBluetooth();
    void playMusic();
    void chargeCase();
    default String getDescription() {
        return "This is a default method";
    }
}
