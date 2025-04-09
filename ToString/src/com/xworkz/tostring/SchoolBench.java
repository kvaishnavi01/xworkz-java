package com.xworkz.tostring;

public class SchoolBench {
    private String material;
    private int length;
    private boolean hasBackrest;

    public SchoolBench(String material, int length, boolean hasBackrest) {
        this.material = material;
        this.length = length;
        this.hasBackrest = hasBackrest;
    }

    @Override
    public String toString() {
        return "material is " + this.material + " length is " + this.length + " backrest is " + this.hasBackrest;
    }
}
