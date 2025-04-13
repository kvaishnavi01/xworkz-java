package com.xworkz.tostring;

public class Cycle {
    private String brand;
    private int gearCount;
    private String frameMaterial;

    public Cycle(String brand, int gearCount, String frameMaterial) {
        this.brand = brand;
        this.gearCount = gearCount;
        this.frameMaterial = frameMaterial;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " gear count is " + this.gearCount +
                " frame material is " + this.frameMaterial;
    }

    @Override
    public int hashCode(){
        return 24;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Cycle) {
                System.out.println("will compare.....");
                Cycle c1 = this;
                Cycle c2 = (Cycle) obj;
                if(c1.brand.equals(c2.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
