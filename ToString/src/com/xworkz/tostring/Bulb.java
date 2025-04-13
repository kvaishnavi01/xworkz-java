package com.xworkz.tostring;

public class Bulb {
    private String type;
    private int wattage;
    private boolean isLED;

    public Bulb(String type, int wattage, boolean isLED) {
        this.type = type;
        this.wattage = wattage;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " wattage is " + this.wattage + " LED is " + this.isLED;
    }

    @Override
    public int hashCode() {
        return 70;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bulb) {
                System.out.println("will compare.....");
                Bulb b1 = this;
                Bulb b2 = (Bulb) obj;
                if (b1.type.equals(b2.type) && b1.wattage == b2.wattage && b1.isLED == b2.isLED) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
