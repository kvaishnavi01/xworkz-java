package com.xworkz.ralation;

public class Capacitor {
    private int capacitance;
    private String type;

    public Capacitor(int capacitance, String type){
        this.capacitance=capacitance;
        this.type=type;
    }

    public void charge(){
        System.out.println("running charge in capacitor");
    }
}
