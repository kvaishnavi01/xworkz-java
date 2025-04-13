package com.xworkz.tostring;

public class Windmill {
    private String location;
    private double bladeLength;
    private int energyOutput;

    public Windmill(String location, double bladeLength, int energyOutput) {
        this.location = location;
        this.bladeLength = bladeLength;
        this.energyOutput = energyOutput;
    }

    @Override
    public String toString() {
        return "location is " + this.location +
                " blade length is " + this.bladeLength + " meters" +
                " energy output is " + this.energyOutput + " kW";
    }

    @Override
    public int hashCode(){
        return 33;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Windmill) {
                System.out.println("will compare.....");
                Windmill windmill = this;
                Windmill windmill1 = (Windmill) obj;
                if(windmill.location.equals(windmill1.location) && windmill.energyOutput == windmill1.energyOutput) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
