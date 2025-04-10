package com.xworkz.tostring;

public class Pyramid {
    private String name;
    private double height;
    private int estimatedConstructionYear;

    public Pyramid(String name, double height, int estimatedConstructionYear) {
        this.name = name;
        this.height = height;
        this.estimatedConstructionYear = estimatedConstructionYear;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " height is " + this.height + " meters" +
                " estimated construction year is " + this.estimatedConstructionYear;
    }
    @Override
    public int hashCode(){
        return 37;
    }
}
