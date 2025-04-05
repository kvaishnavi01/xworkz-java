package com.xworkz.inheritance;

public class OrangeJuice extends Juice {
    public OrangeJuice() {
        System.out.println("no args const of OrangeJuice");
    }

    @Override
    public void pour() {
        System.out.println("OrangeJuice is poured fresh");
    }

    @Override
    public void mix() {
        System.out.println("OrangeJuice is mixed with pulp");
    }

    @Override
    public void chill() {
        System.out.println("OrangeJuice is cooled with ice");
    }

    @Override
    public void addSugar() {
        System.out.println("No sugar added to OrangeJuice");
    }

    @Override
    public void serve() {
        System.out.println("OrangeJuice served with slice");
    }
}
