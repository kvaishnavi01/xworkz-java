package com.xworkz.interfaces;

class DeviceHub implements Keyboard, Monitor, Mouse, Phone, PowerBank {
    public void type() {
        System.out.println("DeviceHub: Typing on keyboard.");
    }
    public void backlight() {
        System.out.println("DeviceHub: Activating keyboard backlight.");
    }
    public void connect() {
        System.out.println("DeviceHub: Connecting keyboard to device.");
    }
    public void displayOutput() {
        System.out.println("DeviceHub: Displaying output on monitor.");
    }
    public void changeBrightness() {
        System.out.println("DeviceHub: Adjusting monitor brightness.");
    }
    public void powerOff() {
        System.out.println("DeviceHub: Powering off monitor.");
    }
    public void click() {
        System.out.println("DeviceHub: Clicking with mouse.");
    }
    public void scroll() {
        System.out.println("DeviceHub: Scrolling with mouse.");
    }
    public void connectToPC() {
        System.out.println("DeviceHub: Connecting mouse to PC.");
    }
    public void makeCall() {
        System.out.println("DeviceHub: Making a call with phone.");
    }
    public void receiveCall() {
        System.out.println("DeviceHub: Receiving a call on phone.");
    }
    public void charge() {
        System.out.println("DeviceHub: Charging phone.");
    }
    public void chargeDevice() {
        System.out.println("DeviceHub: Charging device with power bank.");
    }
    public void checkBattery() {
        System.out.println("DeviceHub: Checking power bank battery level.");
    }
    public void turnOff() {
        System.out.println("DeviceHub: Turning off power bank.");
    }
}