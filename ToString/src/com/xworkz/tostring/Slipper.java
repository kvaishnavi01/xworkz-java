package com.xworkz.tostring;

public class Slipper {
    private String size;
    private int price;
    private boolean isWaterproof;

    public Slipper(String size, int price, boolean isWaterproof) {
        this.size = size;
        this.price = price;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "size is " + this.size + " price is " + this.price + " waterproof is " + this.isWaterproof;
    }
}
