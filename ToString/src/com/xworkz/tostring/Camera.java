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

    @Override
    public int hashCode(){
        return 11;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Camera) {
                System.out.println("will compare.....");
                Camera c1 = this;
                Camera c2 = (Camera) obj;
                if(c1.isDSLR == c2.isDSLR) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
