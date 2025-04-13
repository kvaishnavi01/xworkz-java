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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Telescope) {
                System.out.println("will compare.....");
                Telescope t1 = this;
                Telescope t2 = (Telescope) obj;
                if(t1.brand.equals(t2.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
