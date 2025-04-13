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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Curtain) {
                System.out.println("will compare.....");
                Curtain c1 = this;
                Curtain c2 = (Curtain) obj;
                if(c1.fabric.equals(c2.fabric) && c1.width == c2.width && c1.isPrinted == c2.isPrinted) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
