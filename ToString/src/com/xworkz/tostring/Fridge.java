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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Fridge) {
                System.out.println("will compare.....");
                Fridge f1 = this;
                Fridge f2 = (Fridge) obj;
                if(f1.capacity == f2.capacity) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
