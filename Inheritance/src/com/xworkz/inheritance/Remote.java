package com.xworkz.inheritance;

public class Remote {
    public Remote() {
        System.out.println("no args const of Remote");
    }

    public void powerOn() {
        System.out.println("Remote turns device on");
    }

    public void powerOff() {
        System.out.println("Remote turns device off");
    }

    public void increaseVolume() {
        System.out.println("Remote increases volume");
    }

    public void decreaseVolume() {
        System.out.println("Remote decreases volume");
    }

    public void changeChannel() {
        System.out.println("Remote changes channel");
    }
}
