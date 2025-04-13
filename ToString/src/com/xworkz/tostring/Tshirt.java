package com.xworkz.tostring;

import java.util.Objects;

public class Tshirt {
    private String brand;
    private int size;
    private String color;

    Tshirt(){
        System.out.println("no args const of Tshirt");
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("ref is not null");
            if(obj instanceof Tshirt){
                System.out.println("ref is tshirt, will compare.....");
                Tshirt tshirt1=this;
                Tshirt tshirt2=(Tshirt) obj;
                if(tshirt1.brand.equals(tshirt2.brand) &&tshirt1.color.equals(tshirt2.color) && tshirt1.size==tshirt2.size){
                    System.out.println("both are same");
                    return true;
                }

            }
        }
        return false;
    }



}
