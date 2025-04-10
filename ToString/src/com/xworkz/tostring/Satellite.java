package com.xworkz.tostring;

public class Satellite {
    private String name;
    private double weight;
    private boolean isActive;

    public Satellite(String name, double weight, boolean isActive) {
        this.name = name;
        this.weight = weight;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " weight is " + this.weight + " active is " + this.isActive;
    }
    @Override
    public int hashCode(){
        return 50;
    }
}
