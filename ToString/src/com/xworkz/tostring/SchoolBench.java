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

    @Override
    public int hashCode() {
        return 82;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SchoolBench) {
                System.out.println("will compare.....");
                SchoolBench b1 = this;
                SchoolBench b2 = (SchoolBench) obj;
                if (b1.material.equals(b2.material) && b1.length == b2.length && b1.hasBackrest == b2.hasBackrest) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
