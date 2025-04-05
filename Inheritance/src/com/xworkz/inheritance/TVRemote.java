package com.xworkz.inheritance;

public class TVRemote extends Remote {
    public TVRemote() {
        System.out.println("no args const of TVRemote");
    }

    @Override
    public void powerOn() {
        System.out.println("TVRemote powers on TV");
    }

    @Override
    public void powerOff() {
        System.out.println("TVRemote powers off TV");
    }

    @Override
    public void increaseVolume() {
        System.out.println("TVRemote turns volume up");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("TVRemote turns volume down");
    }

    @Override
    public void changeChannel() {
        System.out.println("TVRemote switches to next channel");
    }
}
