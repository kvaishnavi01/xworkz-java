package com.xworkz.tostring;

public class Comb {
    private String material;
    private int teethCount;
    private boolean isFoldable;

    public Comb(String material, int teethCount, boolean isFoldable) {
        this.material = material;
        this.teethCount = teethCount;
        this.isFoldable = isFoldable;
    }

    @Override
    public String toString() {
        return "material is " + this.material + " teeth count is " + this.teethCount + " foldable is " + this.isFoldable;
    }

    @Override
    public int hashCode() {
        return 87;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Comb) {
                System.out.println("will compare.....");
                Comb c1 = this;
                Comb c2 = (Comb) obj;
                if (c1.material.equals(c2.material) && c1.teethCount == c2.teethCount && c1.isFoldable == c2.isFoldable) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
