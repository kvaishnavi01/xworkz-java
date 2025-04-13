package com.xworkz.tostring;

public class Stapler {
    private String model;
    private int pinCapacity;
    private boolean isMetalBody;

    public Stapler(String model, int pinCapacity, boolean isMetalBody) {
        this.model = model;
        this.pinCapacity = pinCapacity;
        this.isMetalBody = isMetalBody;
    }

    @Override
    public String toString() {
        return "model is " + this.model + " pin capacity is " + this.pinCapacity + " metal body is " + this.isMetalBody;
    }

    @Override
    public int hashCode() {
        return 91;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Stapler) {
                System.out.println("will compare.....");
                Stapler s1 = this;
                Stapler s2 = (Stapler) obj;
                if (s1.model.equals(s2.model) && s1.pinCapacity == s2.pinCapacity && s1.isMetalBody == s2.isMetalBody) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
