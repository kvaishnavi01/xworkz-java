package com.xworkz.tostring;

public class Chair {
    private String type;
    private String material;
    private double height;

    public Chair(String type, String material, double height) {
        this.type = type;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "type is " + this.type +
                " material is " + this.material +
                " height is " + this.height + " ft";
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
