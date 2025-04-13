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

    @Override
    public int hashCode(){
        return 12;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Keyboard) {
                System.out.println("will compare.....");
                Keyboard k1 = this;
                Keyboard k2 = (Keyboard) obj;
                if(k1.isMechanical == k2.isMechanical) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
