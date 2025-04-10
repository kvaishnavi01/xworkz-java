package com.xworkz.tostring;

public class Museum {
    private String name;
    private int establishedYear;
    private boolean hasVirtualTour;

    public Museum(String name, int establishedYear, boolean hasVirtualTour) {
        this.name = name;
        this.establishedYear = establishedYear;
        this.hasVirtualTour = hasVirtualTour;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " established year is " + this.establishedYear +
                " virtual tour available is " + this.hasVirtualTour;
    }
    @Override
    public int hashCode(){
        return 28;
    }
}
