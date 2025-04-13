package com.xworkz.tostring;

public class Planet {
    private String name;
    private double diameter;
    private boolean hasRings;

    public Planet(String name, double diameter, boolean hasRings) {
        this.name = name;
        this.diameter = diameter;
        this.hasRings = hasRings;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " diameter is " + this.diameter + " km" +
                " has rings is " + this.hasRings;
    }

    @Override
    public int hashCode(){
        return 36;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Planet) {
                System.out.println("will compare.....");
                Planet planet = this;
                Planet planet1 = (Planet) obj;
                if(planet.name.equals(planet1.name) && planet.hasRings == planet1.hasRings) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
