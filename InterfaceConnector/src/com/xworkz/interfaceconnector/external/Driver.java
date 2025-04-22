package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Car;

public class Driver {
    private Car car;

    public Driver(Car car) {
        System.out.println("Driver with Car created");
        this.car = car;
    }

    public void travel() {
        System.out.println("Driver is using car");
        if (car != null) {
            this.car.drive();
        }
    }
}