package com.xworkz.inheritance;

public class Earth extends Planet {
    public Earth() {
        System.out.println("no args const of Earth");
    }

    @Override
    public void rotate() {
        System.out.println("Earth completes one rotation in 24 hours");
    }

    @Override
    public void revolve() {
        System.out.println("Earth revolves around the sun in 365 days");
    }

    @Override
    public void supportLife() {
        System.out.println("Earth supports abundant life");
    }

    @Override
    public void reflectLight() {
        System.out.println("Earth reflects sunlight and glows blue from space");
    }

    @Override
    public void showGravity() {
        System.out.println("Earth has 9.8 m/s² gravity");
    }
}
