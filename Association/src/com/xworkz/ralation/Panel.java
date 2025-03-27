package com.xworkz.ralation;

public class Panel {
    private String color;
    private String thickness;

    public Panel(String color,String thickness){
        this.thickness=thickness;
        this.color=color;
    }
    public void attach(){
        System.out.println("runninf attach in Panel");
    }
}
