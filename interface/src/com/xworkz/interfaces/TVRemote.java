package com.xworkz.interfaces;

public class TVRemote implements Remote {
    public void turnOn() {
        System.out.println("Turning on the TV.");
    }
    public void turnOff() {
        System.out.println("Turning off the TV.");
    }
    public void changeChannel() {
        System.out.println("Changing TV channel.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
