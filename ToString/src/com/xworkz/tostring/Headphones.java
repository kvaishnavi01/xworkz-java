package com.xworkz.tostring;

public class Headphones {
    private String brand;
    private int price;
    private boolean isWireless;

    public Headphones(String brand, int price, boolean isWireless) {
        this.brand = brand;
        this.price = price;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " price is " + this.price + " wireless is " + this.isWireless;
    }

    @Override
    public int hashCode() {
        return 98;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Headphones) {
                System.out.println("will compare.....");
                Headphones h1 = this;
                Headphones h2 = (Headphones) obj;
                if (h1.brand.equals(h2.brand) && h1.price == h2.price && h1.isWireless == h2.isWireless) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
