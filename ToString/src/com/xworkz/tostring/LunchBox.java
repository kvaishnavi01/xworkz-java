package com.xworkz.tostring;

public class LunchBox {
    private String shape;
    private int compartments;
    private boolean isMicrowaveSafe;

    public LunchBox(String shape, int compartments, boolean isMicrowaveSafe) {
        this.shape = shape;
        this.compartments = compartments;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "shape is " + this.shape + " compartments are " + this.compartments + " microwave safe is " + this.isMicrowaveSafe;
    }

    @Override
    public int hashCode() {
        return 92;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof LunchBox) {
                System.out.println("will compare.....");
                LunchBox l1 = this;
                LunchBox l2 = (LunchBox) obj;
                if (l1.shape.equals(l2.shape) && l1.compartments == l2.compartments && l1.isMicrowaveSafe == l2.isMicrowaveSafe) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
