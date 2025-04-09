package com.xworkz.tostring;

public class Harbor {
    private String city;
    private int dockCount;
    private boolean handlesCargoShips;

    public Harbor(String city, int dockCount, boolean handlesCargoShips) {
        this.city = city;
        this.dockCount = dockCount;
        this.handlesCargoShips = handlesCargoShips;
    }

    @Override
    public String toString() {
        return "city is " + this.city +
                " dock count is " + this.dockCount +
                " handles cargo ships is " + this.handlesCargoShips;
    }
}
