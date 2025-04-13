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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Museum) {
                System.out.println("will compare.....");
                Museum m1 = this;
                Museum m2 = (Museum) obj;
                if(m1.name.equals(m2.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
