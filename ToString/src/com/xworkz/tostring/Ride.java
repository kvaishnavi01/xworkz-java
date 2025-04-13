package com.xworkz.tostring;

public class Ride {
    private String rideName;
    private double duration;
    private boolean isThrillRide;

    public Ride(String rideName, double duration, boolean isThrillRide) {
        this.rideName = rideName;
        this.duration = duration;
        this.isThrillRide = isThrillRide;
    }

    @Override
    public String toString() {
        return "ride is " + this.rideName + " duration is " + this.duration + " thrill ride is " + this.isThrillRide;
    }

    @Override
    public int hashCode(){
        return 72;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Ride) {
                System.out.println("will compare.....");
                Ride r1 = this;
                Ride r2 = (Ride) obj;
                if(r1.rideName.equals(r2.rideName) && r1.duration == r2.duration && r1.isThrillRide == r2.isThrillRide) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
