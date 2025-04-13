package com.xworkz.tostring;

public class Toothbrush {
    private String brand;
    private int bristleCount;
    private boolean isElectric;

    public Toothbrush(String brand, int bristleCount, boolean isElectric) {
        this.brand = brand;
        this.bristleCount = bristleCount;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " bristle count is " + this.bristleCount + " electric is " + this.isElectric;
    }

    @Override
    public int hashCode() {
        return 85;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Toothbrush) {
                System.out.println("will compare.....");
                Toothbrush t1 = this;
                Toothbrush t2 = (Toothbrush) obj;
                if (t1.brand.equals(t2.brand) && t1.bristleCount == t2.bristleCount && t1.isElectric == t2.isElectric) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
