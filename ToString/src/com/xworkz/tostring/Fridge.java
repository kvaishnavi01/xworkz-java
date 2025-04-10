package com.xworkz.tostring;

public class Fridge {
    private String brand;
    private int capacity;
    private boolean hasFreezer;

    public Fridge(String brand, int capacity, boolean hasFreezer) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " capacity is " + this.capacity + "L" +
                " has freezer is " + this.hasFreezer;
    }
    @Override
    public int hashCode(){
        return 19;
    }
}
