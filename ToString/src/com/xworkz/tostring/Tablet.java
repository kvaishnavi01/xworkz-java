package com.xworkz.tostring;

public class Tablet {
    private String brand;
    private double screenSize;
    private boolean supportsStylus;

    public Tablet(String brand, double screenSize, boolean supportsStylus) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.supportsStylus = supportsStylus;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " screen size is " + this.screenSize + " inches" +
                " stylus support is " + this.supportsStylus;
    }

    @Override
    public int hashCode(){
        return 20;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Tablet) {
                System.out.println("will compare.....");
                Tablet t1 = this;
                Tablet t2 = (Tablet) obj;
                if(t1.screenSize == t2.screenSize) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
