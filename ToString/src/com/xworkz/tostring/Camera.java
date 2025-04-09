package com.xworkz.tostring;

public class Camera {
    private String brand;
    private double resolution;
    private boolean isDSLR;

    public Camera(String brand, double resolution, boolean isDSLR) {
        this.brand = brand;
        this.resolution = resolution;
        this.isDSLR = isDSLR;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " resolution is " + this.resolution + "MP" +
                " DSLR is " + this.isDSLR;
    }
}
