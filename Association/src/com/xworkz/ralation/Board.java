package com.xworkz.ralation;

public class Board {
    private int weight;
    private Capacitor capacitor;

    public Board(int weight, Capacitor capacitor){
        this.capacitor=capacitor;
        this.weight=weight;
    }
    public void getDetails(){
        System.out.println("running in Board");
        this.capacitor.charge();
    }
}
