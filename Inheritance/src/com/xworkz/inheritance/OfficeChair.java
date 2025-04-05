package com.xworkz.inheritance;

public class OfficeChair extends Chair {
    public OfficeChair() {
        System.out.println("no args const of OfficeChair");
    }

    @Override
    public void support() {
        System.out.println("Office chair supports back while working");
    }

    @Override
    public void holdWeight() {
        System.out.println("Office chair holds heavy weight");
    }

    @Override
    public void fold() {
        System.out.println("Office chair cannot be folded");
    }

    @Override
    public void move() {
        System.out.println("Office chair moves with wheels");
    }

    @Override
    public void place() {
        System.out.println("Office chair is placed near work desk");
    }
}
