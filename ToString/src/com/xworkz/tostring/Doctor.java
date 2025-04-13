package com.xworkz.tostring;

public class Doctor {
    private String name;
    private int experience;
    private boolean isSurgeon;

    public Doctor(String name, int experience, boolean isSurgeon) {
        this.name = name;
        this.experience = experience;
        this.isSurgeon = isSurgeon;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " experience is " + this.experience + " surgeon is " + this.isSurgeon;
    }

    @Override
    public int hashCode(){
        return 59;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Doctor) {
                System.out.println("will compare.....");
                Doctor d1 = this;
                Doctor d2 = (Doctor) obj;
                if(d1.name.equals(d2.name) && d1.experience == d2.experience) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
