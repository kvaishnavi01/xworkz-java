package com.xworkz.ralation;

public class Button {
    private String color;
    private Material material;

    public Button(String color, Material material){
        this.color=color;
        this.material=material;
    }

    public void press(){
        System.out.println("running press in button");
        this.material.getProp();
    }
}
