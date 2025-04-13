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

    @Override
    public int hashCode() {
        return 74;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof DivingSuit) {
                System.out.println("will compare.....");
                DivingSuit d1 = this;
                DivingSuit d2 = (DivingSuit) obj;
                if(d1.material.equals(d2.material) && d1.depthLimit == d2.depthLimit && d1.hasOxygenTank == d2.hasOxygenTank) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
