package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Speaker;

public class BluetoothSpeaker implements Speaker {
    public BluetoothSpeaker() {
        System.out.println("BluetoothSpeaker created");
    }

    @Override
    public void sound() {
        System.out.println("BluetoothSpeaker is playing sound");
    }
}