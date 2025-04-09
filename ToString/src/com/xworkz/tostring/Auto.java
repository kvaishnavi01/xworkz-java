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
}
