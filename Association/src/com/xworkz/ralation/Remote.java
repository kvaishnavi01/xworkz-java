package com.xworkz.ralation;

public class Remote {
    private String status;
    Battery battery;

    public Remote(String status, Battery battery){
        this.status=status;
        this.battery=battery;
    }

    public void changeBattery(){
        System.out.println("running changebattery in remote");
        this.battery.charging();
    }
}
