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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Projector) {
                System.out.println("will compare.....");
                Projector p1 = this;
                Projector p2 = (Projector) obj;
                if(p1.resolution.equals(p2.resolution)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
