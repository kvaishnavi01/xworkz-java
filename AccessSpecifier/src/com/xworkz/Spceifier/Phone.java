package com.xworkz.Spceifier;

public class Phone {
    public String name ="Samsung";
    private int password =123456;
    String storage="256GB";

    public void PowerOn(){
        System.out.println("Switching on "+name);
    }

    private void CameraAcess(){
        System.out.print("limited to owner");
    }

    void powerOff(){
        System.out.print("Switching off your phone");
    }
}




