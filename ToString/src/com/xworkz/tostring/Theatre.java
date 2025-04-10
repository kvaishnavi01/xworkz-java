package com.xworkz.tostring;

public class Theatre {
    private String name;
    private byte screens;
    private short seatingCapacity;

    public Theatre(String name, byte screens, short seatingCapacity) {
        this.name = name;
        this.screens = screens;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " screens are " + this.screens + " capacity is " + this.seatingCapacity;
    }
    @Override
    public int hashCode(){
        return 63;
    }
}
