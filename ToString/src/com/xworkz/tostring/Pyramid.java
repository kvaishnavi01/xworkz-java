package com.xworkz.tostring;

public class Pyramid {
    private String name;
    private double height;
    private int estimatedConstructionYear;

    public Pyramid(String name, double height, int estimatedConstructionYear) {
        this.name = name;
        this.height = height;
        this.estimatedConstructionYear = estimatedConstructionYear;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " height is " + this.height + " meters" +
                " estimated construction year is " + this.estimatedConstructionYear;
    }

    @Override
    public int hashCode(){
        return 37;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Pyramid) {
                System.out.println("will compare.....");
                Pyramid pyramid = this;
                Pyramid pyramid1 = (Pyramid) obj;
                if(pyramid.name.equals(pyramid1.name) && pyramid.estimatedConstructionYear == pyramid1.estimatedConstructionYear) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
