package com.xworkz.tostring;

public class Submarine {
    private String name;
    private double depthLimit;
    private boolean nuclearPowered;

    public Submarine(String name, double depthLimit, boolean nuclearPowered) {
        this.name = name;
        this.depthLimit = depthLimit;
        this.nuclearPowered = nuclearPowered;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " depth limit is " + this.depthLimit + " meters" +
                " nuclear powered is " + this.nuclearPowered;
    }

    @Override
    public int hashCode(){
        return 35;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Submarine) {
                System.out.println("will compare.....");
                Submarine submarine = this;
                Submarine submarine1 = (Submarine) obj;
                if(submarine.name.equals(submarine1.name) && submarine.nuclearPowered == submarine1.nuclearPowered) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
