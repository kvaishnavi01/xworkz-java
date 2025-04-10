package com.xworkz.tostring;

public class Curtain {
    private String fabric;
    private int width;
    private boolean isPrinted;

    public Curtain(String fabric, int width, boolean isPrinted) {
        this.fabric = fabric;
        this.width = width;
        this.isPrinted = isPrinted;
    }

    @Override
    public String toString() {
        return "fabric is " + this.fabric + " width is " + this.width + " printed is " + this.isPrinted;
    }
    @Override
    public int hashCode(){
        return 89;
    }
}
