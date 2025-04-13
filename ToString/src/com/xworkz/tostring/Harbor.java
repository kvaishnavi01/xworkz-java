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

    @Override
    public int hashCode(){
        return 32;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Harbor) {
                System.out.println("will compare.....");
                Harbor harbor = this;
                Harbor harbor1 = (Harbor) obj;
                if(harbor.city.equals(harbor1.city) && harbor.dockCount == harbor1.dockCount) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
