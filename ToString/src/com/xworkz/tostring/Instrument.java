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
    public int hashCode() {
        return 62;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Instrument) {
                System.out.println("will compare.....");
                Instrument i1 = this;
                Instrument i2 = (Instrument) obj;
                if(i1.type.equals(i2.type) && i1.cost == i2.cost && i1.isElectric == i2.isElectric) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
