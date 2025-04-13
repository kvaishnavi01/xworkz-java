package com.xworkz.tostring;

public class PencilBox {
    private String color;
    private int slots;
    private boolean hasSharpener;

    public PencilBox(String color, int slots, boolean hasSharpener) {
        this.color = color;
        this.slots = slots;
        this.hasSharpener = hasSharpener;
    }

    @Override
    public String toString() {
        return "color is " + this.color + " slots are " + this.slots + " sharpener is " + this.hasSharpener;
    }

    @Override
    public int hashCode() {
        return 80;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof PencilBox) {
                System.out.println("will compare.....");
                PencilBox p1 = this;
                PencilBox p2 = (PencilBox) obj;
                if (p1.color.equals(p2.color) && p1.slots == p2.slots && p1.hasSharpener == p2.hasSharpener) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
