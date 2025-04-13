package com.xworkz.tostring;

public class Satellite {
    private String name;
    private double weight;
    private boolean isActive;

    public Satellite(String name, double weight, boolean isActive) {
        this.name = name;
        this.weight = weight;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " weight is " + this.weight + " active is " + this.isActive;
    }

    @Override
    public int hashCode(){
        return 50;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Satellite) {
                System.out.println("will compare.....");
                Satellite s1 = this;
                Satellite s2 = (Satellite) obj;
                if(s1.name.equals(s2.name) && s1.isActive == s2.isActive) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
