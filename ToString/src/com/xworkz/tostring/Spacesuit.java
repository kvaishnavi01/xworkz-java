package com.xworkz.tostring;

public class Spacesuit {
    private String model;
    private int oxygenCapacity;
    private boolean radiationShield;

    public Spacesuit(String model, int oxygenCapacity, boolean radiationShield) {
        this.model = model;
        this.oxygenCapacity = oxygenCapacity;
        this.radiationShield = radiationShield;
    }

    @Override
    public String toString() {
        return "model is " + this.model +
                " oxygen capacity is " + this.oxygenCapacity + " minutes" +
                " radiation shield is " + this.radiationShield;
    }

    @Override
    public int hashCode(){
        return 30;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Spacesuit) {
                System.out.println("will compare.....");
                Spacesuit s1 = this;
                Spacesuit s2 = (Spacesuit) obj;
                if(s1.model.equals(s2.model)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
