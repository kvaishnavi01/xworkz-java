package com.xworkz.tostring;

public class Projector {
    private String brand;
    private String resolution;
    private boolean isPortable;

    public Projector(String brand, String resolution, boolean isPortable) {
        this.brand = brand;
        this.resolution = resolution;
        this.isPortable = isPortable;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " resolution is " + this.resolution +
                " portable is " + this.isPortable;
    }
    @Override
    public int hashCode(){
        return 21;
    }
}
