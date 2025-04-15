package com.xworkz.abstractclass;

public class  MainRunner {
    public static void main(String[] args) {

        House house = new House();
        house.buildingType();
        System.out.println("--------------------------------------------------");

        Car car = new Car();
        car.startEngine();
        System.out.println("--------------------------------------------------");

        WashingMachine wm = new WashingMachine();
        wm.plugIn();
        wm.turnOn();
        System.out.println("--------------------------------------------------");

        CollegeStudent student = new CollegeStudent("vk", 21, "Computer Science");
        student.displayInfo();
        System.out.println("--------------------------------------------------");

        InternationalFlight flight = new InternationalFlight("Emirates", "Dubai", "New York", 120000);
        flight.flightDetails();
        System.out.println("##################################################");
    }
}
