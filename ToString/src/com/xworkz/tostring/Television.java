package com.xworkz.tostring;

public class Television {
    private String brand;
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, int screenSize, boolean isSmart) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " screen size is " + this.screenSize + " inches" +
                " smart TV is " + this.isSmart;
    }
    @Override
    public int hashCode(){
        return 13;
    }

}
