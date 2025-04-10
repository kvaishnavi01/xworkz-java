package com.xworkz.tostring;

public class Mouse {
    private String brand;
    private boolean isWireless;
    private int dpi;

    public Mouse(String brand, boolean isWireless, int dpi) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " wireless is " + this.isWireless +
                " DPI is " + this.dpi;
    }
    @Override
    public int hashCode(){
        return 23;
    }
}
