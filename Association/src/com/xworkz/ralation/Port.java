package com.xworkz.ralation;

public class Port {
    private int number;
    PortType type;

    public Port(int number, PortType type){
        this.number=number;
        this.type=type;
    }

    public void connect(){
        System.out.println("running connect in Port");
        this.type.plugIn();
    }
}
