package com.xworkz.tostring;

public class Shoe {
    private String brand;
    private int size;
    private String type;

    public Shoe(String brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " size is " + this.size +
                " type is " + this.type;
    }

    @Override
    public int hashCode(){
        return 9;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Shoe) {
                System.out.println("will compare.....");
                Shoe s1 = this;
                Shoe s2 = (Shoe) obj;
                if(s1.size == s2.size) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
