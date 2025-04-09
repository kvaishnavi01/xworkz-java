package com.xworkz.tostring;

public class SpyGadget {
    private String name;
    private int range;
    private boolean isEncrypted;

    public SpyGadget(String name, int range, boolean isEncrypted) {
        this.name = name;
        this.range = range;
        this.isEncrypted = isEncrypted;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " range is " + this.range + " encrypted is " + this.isEncrypted;
    }
}
