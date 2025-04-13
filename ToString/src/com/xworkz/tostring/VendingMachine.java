package com.xworkz.tostring;

public class VendingMachine {
    private String location;
    private int itemCount;
    private boolean isTouchEnabled;

    public VendingMachine(String location, int itemCount, boolean isTouchEnabled) {
        this.location = location;
        this.itemCount = itemCount;
        this.isTouchEnabled = isTouchEnabled;
    }

    @Override
    public String toString() {
        return "location is " + this.location + " item count is " + this.itemCount + " touch enabled is " + this.isTouchEnabled;
    }

    @Override
    public int hashCode() {
        return 78;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof VendingMachine) {
                System.out.println("will compare.....");
                VendingMachine v1 = this;
                VendingMachine v2 = (VendingMachine) obj;
                if (v1.location.equals(v2.location) && v1.itemCount == v2.itemCount && v1.isTouchEnabled == v2.isTouchEnabled) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
