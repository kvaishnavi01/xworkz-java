package com.xworkz.interfaces;

class UtilityTool implements Pencil, Remote {
    public void write() {
        System.out.println("UtilityTool: Writing notes with pencil.");
    }
    public void erase() {
        System.out.println("UtilityTool: Erasing pencil marks.");
    }
    public void sharpen() {
        System.out.println("UtilityTool: Sharpening pencil.");
    }
    public void turnOn() {
        System.out.println("UtilityTool: Turning on device with remote.");
    }
    public void turnOff() {
        System.out.println("UtilityTool: Turning off device with remote.");
    }
    public void changeChannel() {
        System.out.println("UtilityTool: Changing channel with remote.");
    }
}
