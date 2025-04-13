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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Crop) {
                System.out.println("will compare.....");
                Crop c1 = this;
                Crop c2 = (Crop) obj;
                if(c1.type.equals(c2.type) && c1.isSeasonal == c2.isSeasonal) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
