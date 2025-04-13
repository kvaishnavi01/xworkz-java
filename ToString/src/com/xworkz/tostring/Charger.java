package com.xworkz.tostring;

public class Charger {
    private String type;
    private int power;
    private boolean isFastCharging;

    public Charger(String type, int power, boolean isFastCharging) {
        this.type = type;
        this.power = power;
        this.isFastCharging = isFastCharging;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " power is " + this.power + " fast charging is " + this.isFastCharging;
    }

    @Override
    public int hashCode() {
        return 93;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Charger) {
                System.out.println("will compare.....");
                Charger c1 = this;
                Charger c2 = (Charger) obj;
                if (c1.type.equals(c2.type) && c1.power == c2.power && c1.isFastCharging == c2.isFastCharging) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
