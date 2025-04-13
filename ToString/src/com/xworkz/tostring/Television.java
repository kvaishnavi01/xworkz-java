package com.xworkz.tostring;

public class Television {
    private String brand;
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, int screenSize, boolean isSmart) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " screen size is " + this.screenSize + " inches" +
                " smart TV is " + this.isSmart;
    }

    @Override
    public int hashCode(){
        return 13;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Television) {
                System.out.println("will compare.....");
                Television t1 = this;
                Television t2 = (Television) obj;
                if(t1.screenSize == t2.screenSize) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
