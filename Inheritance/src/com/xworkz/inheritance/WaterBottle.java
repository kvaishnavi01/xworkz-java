package com.xworkz.inheritance;

public class WaterBottle extends Bottle {
    public WaterBottle() {
        System.out.println("no args const of WaterBottle");
    }

    @Override
    public void fill() {
        System.out.println("Water bottle is filled with cold water");
    }

    @Override
    public void open() {
        System.out.println("Water bottle cap is opened");
    }

    @Override
    public void close() {
        System.out.println("Water bottle cap is closed tightly");
    }

    @Override
    public void pour() {
        System.out.println("Pouring water from the water bottle");
    }

    @Override
    public void clean() {
        System.out.println("Water bottle is washed with soap");
    }
}
