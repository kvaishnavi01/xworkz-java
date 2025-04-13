package com.xworkz.tostring;

public class Fan {
    private String brand;
    private int speedLevels;
    private String color;

    public Fan(String brand, int speedLevels, String color) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.color = color;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " speed levels are " + this.speedLevels +
                " color is " + this.color;
    }

    @Override
    public int hashCode(){
        return 6;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Fan) {
                System.out.println("will compare.....");
                Fan f1 = this;
                Fan f2 = (Fan) obj;
                if(f1.speedLevels == f2.speedLevels) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
