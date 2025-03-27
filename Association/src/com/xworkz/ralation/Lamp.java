package com.xworkz.ralation;

public class Lamp {
    private int brightness;
    private Warranty warranty;

    public Lamp(int brightness, Warranty warranty){
        this.brightness=brightness;
        this.warranty=warranty;
    }

    public void light(){
        System.out.println("running light inside Lamp");
        this.warranty.showWarranty();
    }
}
