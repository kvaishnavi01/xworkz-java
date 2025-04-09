package com.xworkz.tostring;

public class Printer {
    private String brand;
    private boolean isColor;
    private int pagesPerMinute;

    public Printer(String brand, boolean isColor, int pagesPerMinute) {
        this.brand = brand;
        this.isColor = isColor;
        this.pagesPerMinute = pagesPerMinute;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " color printing is " + this.isColor +
                " pages per minute is " + this.pagesPerMinute;
    }
}
