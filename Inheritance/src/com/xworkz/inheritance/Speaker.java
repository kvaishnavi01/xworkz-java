package com.xworkz.inheritance;

public class Speaker {
    public Speaker() {
        System.out.println("no args const of Speaker");
    }

    public void powerOn() {
        System.out.println("Speaker is powered on");
    }

    public void playMusic() {
        System.out.println("Speaker is playing music");
    }

    public void increaseVolume() {
        System.out.println("Speaker volume increased");
    }

    public void decreaseVolume() {
        System.out.println("Speaker volume decreased");
    }

    public void powerOff() {
        System.out.println("Speaker is powered off");
    }
}
