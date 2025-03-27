package com.xworkz.ralation;

public class Quality {
    private String status;
    private int threshold;

    public Quality(String status, int threshold){
        this.status=status;
        this.threshold=threshold;
    }

    public void evaluate(){
        System.out.println("running evaluate in Quality");
    }
}
