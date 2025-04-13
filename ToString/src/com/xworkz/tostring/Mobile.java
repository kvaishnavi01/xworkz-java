package com.xworkz.tostring;

public class Mobile {
    private String model;
    private int storage;
    private double price;

    public Mobile(String model, int storage, double price) {
        this.model = model;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "model is " + this.model +
                " storage is " + this.storage + "GB" +
                " price is ₹" + this.price;
    }

    @Override
    public int hashCode(){
        return 7;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Mobile) {
                System.out.println("will compare.....");
                Mobile m1 = this;
                Mobile m2 = (Mobile) obj;
                if(m1.storage == m2.storage) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
