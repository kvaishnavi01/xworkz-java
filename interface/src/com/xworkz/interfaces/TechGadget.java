package com.xworkz.interfaces;

class TechGadget implements BluetoothSpeaker, Charger, Earpods, Laptop, SmartWatch {
    public void connectPhone() {
        System.out.println("TechGadget: Connecting speaker to phone via Bluetooth.");
    }
    public void playSound() {
        System.out.println("TechGadget: Playing music through speaker.");
    }
    public void disconnect() {
        System.out.println("TechGadget: Disconnecting speaker from phone.");
    }
    public void plugIn() {
        System.out.println("TechGadget: Plugging in charger to outlet.");
    }
    public void startCharging() {
        System.out.println("TechGadget: Starting device charging.");
    }
    public void stopCharging() {
        System.out.println("TechGadget: Stopping charging process.");
    }
    public void connectBluetooth() {
        System.out.println("TechGadget: Connecting earpods via Bluetooth.");
    }
    public void playMusic() {
        System.out.println("TechGadget: Playing music through earpods.");
    }
    public void chargeCase() {
        System.out.println("TechGadget: Charging earpods case.");
    }
    public void bootUp() {
        System.out.println("TechGadget: Booting up laptop.");
    }
    public void runProgram() {
        System.out.println("TechGadget: Running software on laptop.");
    }
    public void shutDown() {
        System.out.println("TechGadget: Shutting down laptop.");
    }
    public void trackSteps() {
        System.out.println("TechGadget: Tracking steps with smartwatch.");
    }
    public void showNotifications() {
        System.out.println("TechGadget: Displaying notifications on smartwatch.");
    }
    public void measureHeartRate() {
        System.out.println("TechGadget: Measuring heart rate with smartwatch.");
    }
}