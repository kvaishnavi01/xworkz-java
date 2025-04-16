package com.xworkz.interfaces;

class TechMaster implements BluetoothSpeaker, Charger, Earpods, Laptop, SmartWatch {
    public void connectPhone() {
        System.out.println("TechMaster: Connecting phone to Bluetooth speaker.");
    }
    public void playSound() {
        System.out.println("TechMaster: Playing music on speaker.");
    }
    public void disconnect() {
        System.out.println("TechMaster: Disconnecting speaker.");
    }
    public void plugIn() {
        System.out.println("TechMaster: Plugging in charger.");
    }
    public void startCharging() {
        System.out.println("TechMaster: Starting charging process.");
    }
    public void stopCharging() {
        System.out.println("TechMaster: Stopping charger.");
    }
    public void connectBluetooth() {
        System.out.println("TechMaster: Connecting earpods via Bluetooth.");
    }
    public void playMusic() {
        System.out.println("TechMaster: Playing music through earpods.");
    }
    public void chargeCase() {
        System.out.println("TechMaster: Charging earpods case.");
    }
    public void bootUp() {
        System.out.println("TechMaster: Booting up laptop.");
    }
    public void runProgram() {
        System.out.println("TechMaster: Running a program on laptop.");
    }
    public void shutDown() {
        System.out.println("TechMaster: Shutting down laptop.");
    }
    public void trackSteps() {
        System.out.println("TechMaster: Tracking steps with smartwatch.");
    }
    public void showNotifications() {
        System.out.println("TechMaster: Showing notifications on smartwatch.");
    }
    public void measureHeartRate() {
        System.out.println("TechMaster: Measuring heart rate with smartwatch.");
    }
}
