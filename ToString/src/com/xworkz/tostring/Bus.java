package com.xworkz.tostring;

public class Bus {
    private String route;
    private int seats;
    private double fare;

    public Bus(String route, int seats, double fare) {
        this.route = route;
        this.seats = seats;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "route is " + this.route + " seats are " + this.seats + " fare is " + this.fare;
    }
    @Override
    public int hashCode(){
        return 45;
    }
}
