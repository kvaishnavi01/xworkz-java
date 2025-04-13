package com.xworkz.tostring;

public class Keychain {
    private String material;
    private int keyCount;
    private boolean hasNameTag;

    public Keychain(String material, int keyCount, boolean hasNameTag) {
        this.material = material;
        this.keyCount = keyCount;
        this.hasNameTag = hasNameTag;
    }

    @Override
    public String toString() {
        return "material is " + this.material + " key count is " + this.keyCount + " name tag is " + this.hasNameTag;
    }

    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Keychain) {
                System.out.println("will compare.....");
                Keychain k1 = this;
                Keychain k2 = (Keychain) obj;
                if (k1.material.equals(k2.material) && k1.keyCount == k2.keyCount && k1.hasNameTag == k2.hasNameTag) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
