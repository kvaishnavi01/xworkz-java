package com.xworkz.tostring;

public class Tent {
    private String color;
    private int capacity;
    private boolean isWaterproof;

    public Tent(String color, int capacity, boolean isWaterproof) {
        this.color = color;
        this.capacity = capacity;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "color is " + this.color + " capacity is " + this.capacity + " waterproof is " + this.isWaterproof;
    }

    @Override
    public int hashCode(){
        return 71;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Tent) {
                System.out.println("will compare.....");
                Tent t1 = this;
                Tent t2 = (Tent) obj;
                if(t1.color.equals(t2.color) && t1.capacity == t2.capacity && t1.isWaterproof == t2.isWaterproof) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
