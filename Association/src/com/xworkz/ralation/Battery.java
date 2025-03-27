package com.xworkz.ralation;

public class Battery {
    private int charge;
    Voltage voltage;

    public Battery(int charge, Voltage voltage){
        this.charge=charge;
        this.voltage=voltage;
    }

    public void charging(){
        System.out.println("running charging in Battery");
        this.voltage.increase();
    }
}
