package com.xworkz.tostring;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " type is " + this.type +
                " price is ₹" + this.price;
    }

    @Override
    public int hashCode(){
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Watch) {
                System.out.println("will compare.....");
                Watch w1 = this;
                Watch w2 = (Watch) obj;
                if(w1.brand.equals(w2.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
