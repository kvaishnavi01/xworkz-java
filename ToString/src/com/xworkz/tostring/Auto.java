package com.xworkz.tostring;

public class Auto {
    private String driverName;
    private float farePerKm;
    private short routeNumber;

    public Auto(String driverName, float farePerKm, short routeNumber) {
        this.driverName = driverName;
        this.farePerKm = farePerKm;
        this.routeNumber = routeNumber;
    }

    @Override
    public String toString() {
        return "driver is " + this.driverName + " fare is " + this.farePerKm + " route is " + this.routeNumber;
    }

    @Override
    public int hashCode() {
        return 66;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Auto) {
                System.out.println("will compare.....");
                Auto a1 = this;
                Auto a2 = (Auto) obj;
                if (a1.driverName.equals(a2.driverName) && a1.farePerKm == a2.farePerKm && a1.routeNumber == a2.routeNumber) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
