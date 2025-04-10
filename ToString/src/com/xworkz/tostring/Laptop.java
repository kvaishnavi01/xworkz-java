package com.xworkz.tostring;

public class Laptop {
    private String brand;
    private int ramSize;
    private double screenSize;

    public Laptop(String brand, int ramSize, double screenSize){
        this.brand = brand;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
    }

    @Override
    public String toString(){
        return "brand is " + this.brand +
                " ram size is " + this.ramSize + "GB" +
                " screen size is " + this.screenSize + " inches";
    }

    @Override
    public int hashCode(){
        return 2;
    }
}
