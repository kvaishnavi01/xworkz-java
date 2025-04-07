package com.xworkz.inheritance;

public class WirelessSignal extends Signal {
    public WirelessSignal() {
        System.out.println("no args const of WirelessSignal");
    }

    @Override
    public void transmit() {
        System.out.println("Wireless signal is transmitting wirelessly");
    }

    @Override
    public void receive() {
        System.out.println("Wireless signal is being received via antenna");
    }

    @Override
    public void encode() {
        System.out.println("Wireless signal is using special encoding");
    }

    @Override
    public void decode() {
        System.out.println("Wireless signal is being decoded digitally");
    }

    @Override
    public void analyze() {
        System.out.println("Wireless signal analysis in progress");
    }

    public void boost() {
        System.out.println("Wireless signal is being boosted");
    }
}
