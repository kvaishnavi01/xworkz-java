package com.xworkz.tostring;

public class Shirt {
    private String color;
    private char size;
    private double price;

    public Shirt(String color, char size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "color is " + this.color + " size is " + this.size + " price is " + this.price;
    }

    @Override
    public int hashCode() {
        return 54;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Shirt) {
                System.out.println("will compare.....");
                Shirt s1 = this;
                Shirt s2 = (Shirt) obj;
                if(s1.color.equals(s2.color) && s1.size == s2.size) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
