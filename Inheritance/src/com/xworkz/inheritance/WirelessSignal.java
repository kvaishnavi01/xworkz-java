package com.xworkz.inheritance;

public class WirelessSignal extends Signal {
    public WirelessSignal() {
        System.out.println("no args const of WirelessSignal");
    }

    @Override
    public void transmit() {
        System.out.println("Wireless signal is transmitted via radio waves");
    }

    @Override
    public void receive() {
        System.out.println("Wireless signal is received by antenna");
    }

    @Override
    public void amplify() {
        System.out.println("Wireless signal is boosted through a repeater");
    }

    @Override
    public void decode() {
        System.out.println("Wireless signal is decoded from digital format");
    }

    @Override
    public void modulate() {
        System.out.println("Wireless signal is modulated using QAM");
    }
}
