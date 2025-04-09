package com.xworkz.tostring;

public class DivingSuit {
    private String material;
    private int depthLimit;
    private boolean hasOxygenTank;

    public DivingSuit(String material, int depthLimit, boolean hasOxygenTank) {
        this.material = material;
        this.depthLimit = depthLimit;
        this.hasOxygenTank = hasOxygenTank;
    }

    @Override
    public String toString() {
        return "material is " + this.material + " depth limit is " + this.depthLimit + " oxygen tank is " + this.hasOxygenTank;
    }
}
