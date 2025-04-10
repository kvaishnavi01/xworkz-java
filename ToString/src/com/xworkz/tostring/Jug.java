package com.xworkz.tostring;

public class Jug {
    private String color;
    private int capacity;
    private String material;

    public Jug(String color, int capacity,String material){
        this.capacity=capacity;
        this.material=material;
        this.color=color;

    }
    @Override
    public String toString(){
        return "color is "+this.color +"material is " + this.material +" capacity is " +this.capacity;
    }

    @Override
    public int hashCode(){
        return 1;
    }
}
