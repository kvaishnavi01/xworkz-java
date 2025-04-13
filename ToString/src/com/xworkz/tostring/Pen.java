package com.xworkz.tostring;

public class Pen {
    private String brand;
    private String color;
    private double price;

    public Pen(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " color is " + this.color +
                " price is ₹" + this.price;
    }

    @Override
    public int hashCode(){
        return 3;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Pen) {
                System.out.println("will compare.....");
                Pen pen1 = this;
                Pen pen2 = (Pen) obj;
                if(pen1.color.equals(pen2.color)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
