package com.xworkz.ralation;

public class Voltage {
    private String type;
    private int value;

    public  Voltage(String type, int value){
        this.type=type;
        this.value=value;
    }

    public void increase(){
        System.out.println("running inc in voltage");
    }
}
