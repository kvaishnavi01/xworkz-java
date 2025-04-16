package com.xworkz.interfaces;

public class MiniSpeaker implements BluetoothSpeaker {
    public void connectPhone() {
        System.out.println("Bluetooth speaker connected to phone.");
    }

    public void playSound() {
        System.out.println("Playing sound through Bluetooth speaker.");
    }

    public void disconnect() {
        System.out.println("Bluetooth speaker disconnected.");
    }
}
