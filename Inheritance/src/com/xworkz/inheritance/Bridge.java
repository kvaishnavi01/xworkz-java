package com.xworkz.inheritance;

public class Bridge extends Structure {
    public Bridge() {
        System.out.println("no args const of Bridge");
    }

    @Override
    public void build() {
        System.out.println("Bridge is constructed over a river");
    }

    @Override
    public void supportWeight() {
        System.out.println("Bridge supports heavy vehicles");
    }

    @Override
    public void withstandWeather() {
        System.out.println("Bridge is resistant to wind and rain");
    }

    @Override
    public void provideShelter() {
        System.out.println("Bridge does not usually provide shelter");
    }

    @Override
    public void maintain() {
        System.out.println("Bridge requires structural maintenance");
    }

    public void allowTransport() {
        System.out.println("Bridge allows transport across obstacles");
    }
}
