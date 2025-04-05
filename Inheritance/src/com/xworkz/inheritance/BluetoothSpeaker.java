package com.xworkz.inheritance;

public class BluetoothSpeaker extends Speaker {
    public BluetoothSpeaker() {
        System.out.println("no args const of BluetoothSpeaker");
    }

    @Override
    public void powerOn() {
        System.out.println("BluetoothSpeaker turned on with button");
    }

    @Override
    public void playMusic() {
        System.out.println("BluetoothSpeaker playing wireless music");
    }

    @Override
    public void increaseVolume() {
        System.out.println("BluetoothSpeaker volume up via phone");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("BluetoothSpeaker volume down via phone");
    }

    @Override
    public void powerOff() {
        System.out.println("BluetoothSpeaker turned off");
    }
}
