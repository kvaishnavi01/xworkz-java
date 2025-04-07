package com.xworkz.inheritance;

public class IceSculpture extends Sculpture {
    public IceSculpture() {
        System.out.println("no args const of IceSculpture");
    }

    @Override
    public void carve() {
        System.out.println("Ice sculpture is being carved with precision tools");
    }

    @Override
    public void polish() {
        System.out.println("Ice sculpture is being polished to shine");
    }

    @Override
    public void display() {
        System.out.println("Ice sculpture is displayed in a cold room");
    }

    @Override
    public void transport() {
        System.out.println("Ice sculpture is transported in a refrigerated vehicle");
    }

    @Override
    public void restore() {
        System.out.println("Ice sculpture cannot be restored once melted");
    }

    public void meltTime() {
        System.out.println("Ice sculpture will melt in a few hours");
    }
}
