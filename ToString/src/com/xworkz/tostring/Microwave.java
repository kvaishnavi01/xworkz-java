package com.xworkz.tostring;

public class Microwave {
    private String brand;
    private int power;
    private boolean hasGrillFunction;

    public Microwave(String brand, int power, boolean hasGrillFunction) {
        this.brand = brand;
        this.power = power;
        this.hasGrillFunction = hasGrillFunction;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " power is " + this.power + "W" +
                " grill function is " + this.hasGrillFunction;
    }

    @Override
    public int hashCode(){
        return 15;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Microwave) {
                System.out.println("will compare.....");
                Microwave m1 = this;
                Microwave m2 = (Microwave) obj;
                if(m1.hasGrillFunction == m2.hasGrillFunction) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
