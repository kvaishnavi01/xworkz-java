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

    @Override
    public int hashCode(){
        return 40;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof SchoolBag) {
                System.out.println("will compare.....");
                SchoolBag bag = this;
                SchoolBag bag1 = (SchoolBag) obj;
                if(bag.brand.equals(bag1.brand) && bag.zipCount == bag1.zipCount) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
