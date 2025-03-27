package com.xworkz.ralation;

public class Screw {
    private int length;
    private int diameter;

    public Screw(int length, int diameter){
        this.length=length;
        this.diameter=diameter;
    }

    public void tighten(){
        System.out.println("running tighten in screw");
    }
}
