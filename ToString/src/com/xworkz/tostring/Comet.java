package com.xworkz.tostring;

public class Comet {
    private String designation;
    private double orbitalPeriod;
    private boolean isVisibleToNakedEye;

    public Comet(String designation, double orbitalPeriod, boolean isVisibleToNakedEye) {
        this.designation = designation;
        this.orbitalPeriod = orbitalPeriod;
        this.isVisibleToNakedEye = isVisibleToNakedEye;
    }

    @Override
    public String toString() {
        return "designation is " + this.designation +
                " orbital period is " + this.orbitalPeriod + " years" +
                " visible to naked eye is " + this.isVisibleToNakedEye;
    }
}
