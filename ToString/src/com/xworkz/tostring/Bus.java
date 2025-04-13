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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Bus) {
                System.out.println("will compare.....");
                Bus b1 = this;
                Bus b2 = (Bus) obj;
                if(b1.route.equals(b2.route) && b1.seats == b2.seats) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
