package com.xworkz.tostring;

public class Slipper {
    private String size;
    private int price;
    private boolean isWaterproof;

    public Slipper(String size, int price, boolean isWaterproof) {
        this.size = size;
        this.price = price;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "size is " + this.size + " price is " + this.price + " waterproof is " + this.isWaterproof;
    }

    @Override
    public int hashCode() {
        return 86;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Slipper) {
                System.out.println("will compare.....");
                Slipper s1 = this;
                Slipper s2 = (Slipper) obj;
                if (s1.size.equals(s2.size) && s1.price == s2.price && s1.isWaterproof == s2.isWaterproof) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
