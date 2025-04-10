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
    public int hashCode(){
        return 93;
    }
}
