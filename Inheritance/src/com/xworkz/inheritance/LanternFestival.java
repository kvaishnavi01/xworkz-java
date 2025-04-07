package com.xworkz.inheritance;

public class LanternFestival extends Festival {
    public LanternFestival() {
        System.out.println("no args const of LanternFestival");
    }

    @Override
    public void celebrate() {
        System.out.println("Lantern Festival is celebrated with floating lanterns");
    }

    @Override
    public void gatherPeople() {
        System.out.println("People gather near lakes and parks for the lantern release");
    }

    @Override
    public void performRituals() {
        System.out.println("People write wishes on lanterns as part of the ritual");
    }

    @Override
    public void decorate() {
        System.out.println("Lanterns and lights are used for decoration");
    }

    @Override
    public void serveFood() {
        System.out.println("Traditional dumplings are served during the Lantern Festival");
    }

    public void releaseLanterns() {
        System.out.println("People release lanterns into the sky or water");
    }
}
