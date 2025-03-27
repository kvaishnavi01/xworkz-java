package com.xworkz.ralation;

public class Wire {
    private int lenght;
    Quality quality;

    public Wire(int lenght,Quality quality){
        this.lenght=lenght;
        this.quality=quality;
    }

    public void use(){
        System.out.println("running use in Wire");
        this.quality.evaluate();
    }
}
