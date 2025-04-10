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
    public int hashCode(){
        return 78;
    }
}
