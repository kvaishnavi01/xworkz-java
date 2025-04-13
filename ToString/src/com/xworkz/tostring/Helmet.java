package com.xworkz.tostring;

public class Helmet {
    private String brand;
    private String color;
    private boolean isISICertified;

    public Helmet(String brand, String color, boolean isISICertified) {
        this.brand = brand;
        this.color = color;
        this.isISICertified = isISICertified;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " color is " + this.color +
                " ISI certified is " + this.isISICertified;
    }

    @Override
    public int hashCode(){
        return 16;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Helmet) {
                System.out.println("will compare.....");
                Helmet h1 = this;
                Helmet h2 = (Helmet) obj;
                if(h1.isISICertified == h2.isISICertified) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
