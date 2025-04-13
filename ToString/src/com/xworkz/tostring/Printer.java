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

    @Override
    public int hashCode(){
        return 18;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Printer) {
                System.out.println("will compare.....");
                Printer p1 = this;
                Printer p2 = (Printer) obj;
                if(p1.pagesPerMinute == p2.pagesPerMinute) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
