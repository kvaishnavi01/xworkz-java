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
}
