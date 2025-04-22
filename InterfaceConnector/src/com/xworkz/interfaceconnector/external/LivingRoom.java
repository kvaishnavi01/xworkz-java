package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.TV;

public class LivingRoom {
    private TV tv;

    public LivingRoom(TV tv) {
        System.out.println("LivingRoom with TV created");
        this.tv = tv;
    }

    public void entertain() {
        System.out.println("LivingRoom is using TV");
        if (tv != null) {
            this.tv.play();
        }
    }
}