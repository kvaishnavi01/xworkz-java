package com.xworkz.inheritance;

public class StormCloud extends Cloud {
    public StormCloud() {
        System.out.println("no args const of StormCloud");
    }

    @Override
    public void form() {
        System.out.println("StormCloud forming rapidly");
    }

    @Override
    public void rain() {
        System.out.println("StormCloud pouring heavy rain");
    }

    @Override
    public void drift() {
        System.out.println("StormCloud moving violently");
    }

    @Override
    public void changeShape() {
        System.out.println("StormCloud twisting ominously");
    }

    @Override
    public void disappear() {
        System.out.println("StormCloud dissipating with thunder");
    }
}