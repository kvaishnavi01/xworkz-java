package com.xworkz.interfaces;

class GadgetPro implements Earphone, Remote, PowerBank, SmartWatch, BluetoothSpeaker {
    public void playAudio() {
        System.out.println("GadgetPro: Playing podcast through earphones.");
    }
    public void adjustVolume() {
        System.out.println("GadgetPro: Adjusting earphone volume.");
    }
    public void disconnect() {
        System.out.println("GadgetPro: Disconnecting earphones from device.");
    }
    public void turnOn() {
        System.out.println("GadgetPro: Turning on TV with remote.");
    }
    public void changeChannel() {
        System.out.println("GadgetPro: Changing channel with remote.");
    }
    public void chargeDevice() {
        System.out.println("GadgetPro: Charging phone with power bank.");
    }
    public void checkBattery() {
        System.out.println("GadgetPro: Checking power bank battery level.");
    }
    public void turnOff() {
        System.out.println("GadgetPro: Turning off power bank.");
    }
    public void trackSteps() {
        System.out.println("GadgetPro: Tracking daily steps with smartwatch.");
    }
    public void showNotifications() {
        System.out.println("GadgetPro: Displaying notifications on smartwatch.");
    }
    public void measureHeartRate() {
        System.out.println("GadgetPro: Measuring heart rate with smartwatch.");
    }
    public void connectPhone() {
        System.out.println("GadgetPro: Connecting phone to Bluetooth speaker.");
    }
    public void playSound() {
        System.out.println("GadgetPro: Playing music on Bluetooth speaker.");
    }

}
