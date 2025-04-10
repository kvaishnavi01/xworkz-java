package com.xworkz.tostring;

public class Guitar {
    private String type;
    private int strings;
    private boolean isElectric;

    public Guitar(String type, int strings, boolean isElectric) {
        this.type = type;
        this.strings = strings;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " strings are " + this.strings + " electric is " + this.isElectric;
    }
    @Override
    public int hashCode(){
        return 47;
    }
}
