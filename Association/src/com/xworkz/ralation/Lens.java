package com.xworkz.ralation;

public class Lens
{
    private int size;
    private  int resolution;

    public Lens(int size,int resolution){
        this.size=size;
        this.resolution=resolution;
    }

    public void zoom(){
        System.out.println("zoom inside Lens");
    }

}
