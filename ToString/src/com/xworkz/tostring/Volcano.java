package com.xworkz.tostring;

public class Volcano {
    private String name;
    private double height;
    private boolean isActive;

    public Volcano(String name, double height, boolean isActive) {
        this.name = name;
        this.height = height;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " height is " + this.height + " meters" +
                " active is " + this.isActive;
    }

    @Override
    public int hashCode(){
        return 29;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Volcano) {
                System.out.println("will compare.....");
                Volcano v1 = this;
                Volcano v2 = (Volcano) obj;
                if(v1.name.equals(v2.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
