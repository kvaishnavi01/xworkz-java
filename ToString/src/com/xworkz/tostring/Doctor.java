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
}
