package com.xworkz.inheritance;

public class IceSculpture extends Sculpture {
    public IceSculpture() {
        System.out.println("no args const of IceSculpture");
    }

    @Override
    public void carve() {
        System.out.println("Ice sculpture is carved with precision tools");
    }

    @Override
    public void polish() {
        System.out.println("Ice sculpture is polished using warm air");
    }

    @Override
    public void transport() {
        System.out.println("Ice sculpture is transported in a cold truck");
    }

    @Override
    public void display() {
        System.out.println("Ice sculpture is displayed at an ice festival");
    }

    @Override
    public void maintain() {
        System.out.println("Ice sculpture is maintained with cooling systems");
    }
}
