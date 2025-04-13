package com.xworkz.tostring;

public class Bottle {
    private String brand;
    private double volume;
    private boolean isReusable;

    public Bottle(String brand, double volume, boolean isReusable) {
        this.brand = brand;
        this.volume = volume;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " volume is " + this.volume + "L" +
                " reusable is " + this.isReusable;
    }

    @Override
    public int hashCode(){
        return 43;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Bottle) {
                System.out.println("will compare.....");
                Bottle b1 = this;
                Bottle b2 = (Bottle) obj;
                if(b1.brand.equals(b2.brand) && b1.volume == b2.volume) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
