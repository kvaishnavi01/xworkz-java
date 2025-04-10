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
    public int hashCode(){
        return 87;
    }
}
