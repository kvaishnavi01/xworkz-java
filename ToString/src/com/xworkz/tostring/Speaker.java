package com.xworkz.tostring;

public class Speaker {
    private String brand;
    private int wattage;
    private boolean isBluetooth;

    public Speaker(String brand, int wattage, boolean isBluetooth) {
        this.brand = brand;
        this.wattage = wattage;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " wattage is " + this.wattage + "W" +
                " bluetooth is " + this.isBluetooth;
    }

    @Override
    public int hashCode(){
        return 17;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Speaker) {
                System.out.println("will compare.....");
                Speaker s1 = this;
                Speaker s2 = (Speaker) obj;
                if(s1.isBluetooth == s2.isBluetooth) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
