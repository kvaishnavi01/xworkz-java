package com.xworkz.ralation;

public class Material {
    private String name;
    private String hardness;

    public Material(String name,String hardness){
        this.name=name;
        this.hardness=hardness;
    }

    public void getProp(){
        System.out.println("running properties in Material");
    }
}
