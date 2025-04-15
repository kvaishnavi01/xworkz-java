package com.xworkz.abstractclass;

import com.xworkz.abstractclass.Vehicle;

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}
