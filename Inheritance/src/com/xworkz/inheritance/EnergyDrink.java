package com.xworkz.inheritance;

public class EnergyDrink extends Beverage {
    public EnergyDrink() {
        System.out.println("no args const of EnergyDrink");
    }

    @Override
    public void pour() {
        System.out.println("Energy drink is being poured into a sports bottle");
    }

    @Override
    public void drink() {
        System.out.println("Energy drink is being gulped quickly");
    }

    @Override
    public void chill() {
        System.out.println("Energy drink is kept in freezer for a quick chill");
    }

    @Override
    public void openCap() {
        System.out.println("Energy drink pull-tab is being opened");
    }

    @Override
    public void shake() {
        System.out.println("Energy drink is lightly shaken before use");
    }

    public void sip(){
        System.out.println("drinking");
    }
}
