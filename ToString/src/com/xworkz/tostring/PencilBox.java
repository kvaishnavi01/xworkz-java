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
}
