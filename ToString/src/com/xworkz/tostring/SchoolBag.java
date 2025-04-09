package com.xworkz.tostring;

public class SchoolBag {
    private String brand;
    private int zipCount;
    private boolean hasLaptopSlot;
    private double weight;

    public SchoolBag(String brand, int zipCount, boolean hasLaptopSlot, double weight) {
        this.brand = brand;
        this.zipCount = zipCount;
        this.hasLaptopSlot = hasLaptopSlot;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " zip count is " + this.zipCount +
                " has laptop slot is " + this.hasLaptopSlot +
                " weight is " + this.weight + " kg";
    }
}
