package com.xworkz.tostring;

public class SkiBoot {
    private String brand;
    private int size;
    private boolean isWaterproof;

    public SkiBoot(String brand, int size, boolean isWaterproof) {
        this.brand = brand;
        this.size = size;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " size is " + this.size + " waterproof is " + this.isWaterproof;
    }

    @Override
    public int hashCode() {
        return 79;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SkiBoot) {
                System.out.println("will compare.....");
                SkiBoot b1 = this;
                SkiBoot b2 = (SkiBoot) obj;
                if (b1.brand.equals(b2.brand) && b1.size == b2.size && b1.isWaterproof == b2.isWaterproof) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
