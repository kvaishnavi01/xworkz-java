package com.xworkz.tostring;

public class Bicycle {
    private String brand;
    private int gears;
    private boolean hasBell;

    public Bicycle(String brand, int gears, boolean hasBell) {
        this.brand = brand;
        this.gears = gears;
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " gears are " + this.gears + " bell is " + this.hasBell;
    }

    @Override
    public int hashCode(){
        return 58;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Bicycle) {
                System.out.println("will compare.....");
                Bicycle b1 = this;
                Bicycle b2 = (Bicycle) obj;
                if(b1.brand.equals(b2.brand) && b1.gears == b2.gears) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
