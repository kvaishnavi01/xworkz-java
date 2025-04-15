package com.xworkz.abstractclass;

abstract class Appliance {
    protected abstract void turnOn();

    void plugIn() {
        System.out.println("Appliance is plugged in.");
    }
}
