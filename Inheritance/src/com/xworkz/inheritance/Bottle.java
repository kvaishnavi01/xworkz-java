package com.xworkz.inheritance;

public class Bottle {
    public Bottle() {
        System.out.println("no args const of Bottle");
    }

    public void fill() {
        System.out.println("Bottle is filled with liquid");
    }

    public void open() {
        System.out.println("Bottle is opened");
    }

    public void close() {
        System.out.println("Bottle is closed");
    }

    public void pour() {
        System.out.println("Liquid is poured from bottle");
    }

    public void clean() {
        System.out.println("Bottle is being cleaned");
    }
}
