package com.xworkz.tostring;

public class WaterBottle {
    private String brand;
    private int volume;
    private boolean isSteel;

    public WaterBottle(String brand, int volume, boolean isSteel) {
        this.brand = brand;
        this.volume = volume;
        this.isSteel = isSteel;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " volume is " + this.volume + " steel is " + this.isSteel;
    }

    @Override
    public int hashCode() {
        return 81;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof WaterBottle) {
                System.out.println("will compare.....");
                WaterBottle b1 = this;
                WaterBottle b2 = (WaterBottle) obj;
                if (b1.brand.equals(b2.brand) && b1.volume == b2.volume && b1.isSteel == b2.isSteel) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
