package com.xworkz.interfaces;

public interface BluetoothSpeaker {
    void connectPhone();
    void playSound();
    void disconnect();
    default String getDescription() {
        return "This is a default method";
    }
}
