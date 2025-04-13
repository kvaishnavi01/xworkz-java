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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Laptop) {
                System.out.println("will compare.....");
                Laptop lap1 = this;
                Laptop lap2 = (Laptop) obj;
                if(lap1.ramSize == lap2.ramSize) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
