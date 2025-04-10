package com.xworkz.tostring;

public class Crop {
    private String type;
    private int yield;
    private boolean isSeasonal;

    public Crop(String type, int yield, boolean isSeasonal) {
        this.type = type;
        this.yield = yield;
        this.isSeasonal = isSeasonal;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " yield is " + this.yield + " seasonal is " + this.isSeasonal;
    }
    @Override
    public int hashCode(){
        return 53;
    }
}
