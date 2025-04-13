package com.xworkz.tostring;

public class Drone {
    private String model;
    private int flightTime;
    private boolean hasCamera;

    public Drone(String model, int flightTime, boolean hasCamera) {
        this.model = model;
        this.flightTime = flightTime;
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString() {
        return "model is " + this.model +
                " flight time is " + this.flightTime + " mins" +
                " camera included is " + this.hasCamera;
    }

    @Override
    public int hashCode(){
        return 25;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Drone) {
                System.out.println("will compare.....");
                Drone d1 = this;
                Drone d2 = (Drone) obj;
                if(d1.model.equals(d2.model)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
