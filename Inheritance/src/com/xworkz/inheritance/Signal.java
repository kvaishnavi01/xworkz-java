package com.xworkz.inheritance;

public class Signal {
    public Signal() {
        System.out.println("no args const of Signal");
    }

    public void transmit() {
        System.out.println("Signal is transmitting");
    }

    public void receive() {
        System.out.println("Signal is being received");
    }

    public void encode() {
        System.out.println("Signal is being encoded");
    }

    public void decode() {
        System.out.println("Signal is being decoded");
    }

    public void analyze() {
        System.out.println("Signal is being analyzed");
    }
}
