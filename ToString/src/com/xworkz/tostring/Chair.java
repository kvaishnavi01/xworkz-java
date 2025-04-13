package com.xworkz.tostring;

public class Chair {
    private String type;
    private String material;
    private double height;

    public Chair(String type, String material, double height) {
        this.type = type;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "type is " + this.type +
                " material is " + this.material +
                " height is " + this.height + " ft";
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Chair) {
                System.out.println("will compare.....");
                Chair chair1 = this;
                Chair chair2 = (Chair) obj;
                if(chair1.material.equals(chair2.material)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
