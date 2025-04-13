package com.xworkz.tostring;

public class Backpack {
    private String brand;
    private int compartments;
    private boolean isWaterproof;

    public Backpack(String brand, int compartments, boolean isWaterproof) {
        this.brand = brand;
        this.compartments = compartments;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " compartments are " + this.compartments +
                " waterproof is " + this.isWaterproof;
    }

    @Override
    public int hashCode(){
        return 14;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Backpack) {
                System.out.println("will compare.....");
                Backpack b1 = this;
                Backpack b2 = (Backpack) obj;
                if(b1.isWaterproof == b2.isWaterproof) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
