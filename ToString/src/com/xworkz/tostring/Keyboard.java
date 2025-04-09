package com.xworkz.tostring;

public class Keyboard {
    private String brand;
    private boolean isMechanical;
    private int numberOfKeys;

    public Keyboard(String brand, boolean isMechanical, int numberOfKeys) {
        this.brand = brand;
        this.isMechanical = isMechanical;
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " mechanical is " + this.isMechanical +
                " number of keys is " + this.numberOfKeys;
    }
}
