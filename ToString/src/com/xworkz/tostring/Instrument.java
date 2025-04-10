package com.xworkz.tostring;

public class Instrument {
    private String type;
    private double cost;
    private boolean isElectric;

    public Instrument(String type, double cost, boolean isElectric) {
        this.type = type;
        this.cost = cost;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " cost is " + this.cost + " electric is " + this.isElectric;
    }
    @Override
    public int hashCode(){
        return 62;
    }
}
