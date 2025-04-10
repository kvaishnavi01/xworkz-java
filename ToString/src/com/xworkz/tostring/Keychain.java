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
    public int hashCode(){
        return 94;
    }
}
