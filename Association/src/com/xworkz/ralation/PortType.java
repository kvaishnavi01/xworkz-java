package com.xworkz.ralation;

public class PortType {
    private String type;
    private int voltage;

    public PortType(String type, int voltage){
        this.type=type;
        this.voltage=voltage;
    }

    public void plugIn(){
        System.out.println("running plugIn in PortType");
    }
}
