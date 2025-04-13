package com.xworkz.tostring;

public class Sharpener {
    private String brand;
    private int bladeCount;
    private boolean hasContainer;

    public Sharpener(String brand, int bladeCount, boolean hasContainer) {
        this.brand = brand;
        this.bladeCount = bladeCount;
        this.hasContainer = hasContainer;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " blade count is " + this.bladeCount + " container is " + this.hasContainer;
    }

    @Override
    public int hashCode() {
        return 90;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Sharpener) {
                System.out.println("will compare.....");
                Sharpener s1 = this;
                Sharpener s2 = (Sharpener) obj;
                if (s1.brand.equals(s2.brand) && s1.bladeCount == s2.bladeCount && s1.hasContainer == s2.hasContainer) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
