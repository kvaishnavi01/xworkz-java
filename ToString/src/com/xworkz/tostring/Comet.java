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

    @Override
    public int hashCode(){
        return 38;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Comet) {
                System.out.println("will compare.....");
                Comet comet = this;
                Comet comet1 = (Comet) obj;
                if(comet.designation.equals(comet1.designation) && comet.orbitalPeriod == comet1.orbitalPeriod) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
