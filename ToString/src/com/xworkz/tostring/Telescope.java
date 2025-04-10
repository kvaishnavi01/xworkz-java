package com.xworkz.tostring;

public class Telescope {
    private String brand;
    private int magnification;
    private String mountType;

    public Telescope(String brand, int magnification, String mountType) {
        this.brand = brand;
        this.magnification = magnification;
        this.mountType = mountType;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " magnification is " + this.magnification + "x" +
                " mount type is " + this.mountType;
    }
    @Override
    public int hashCode(){
        return 26;
    }
}
