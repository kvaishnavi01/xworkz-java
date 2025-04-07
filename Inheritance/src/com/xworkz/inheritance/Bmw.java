package com.xworkz.inheritance;

public class Bmw {
    public void rides(Vehicle vehicle){
        vehicle.accelerate();
        vehicle.brake();
        vehicle.honk();
        vehicle.stop();
        vehicle.start();

        if (vehicle instanceof  Car){
            Car car=(Car) vehicle;
            car.ride();
        }
    }
}
