package com.xworkz.tostring;

public class Greenhouse {
    private String location;
    private int plantCount;
    private boolean hasIrrigationSystem;

    public Greenhouse(String location, int plantCount, boolean hasIrrigationSystem) {
        this.location = location;
        this.plantCount = plantCount;
        this.hasIrrigationSystem = hasIrrigationSystem;
    }

    @Override
    public String toString() {
        return "location is " + this.location +
                " plant count is " + this.plantCount +
                " irrigation system is " + this.hasIrrigationSystem;
    }

    @Override
    public int hashCode(){
        return 27;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Greenhouse) {
                System.out.println("will compare.....");
                Greenhouse g1 = this;
                Greenhouse g2 = (Greenhouse) obj;
                if(g1.location.equals(g2.location)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
