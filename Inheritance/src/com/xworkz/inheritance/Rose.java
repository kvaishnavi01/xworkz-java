package com.xworkz.inheritance;

public class Rose extends Flower {
    public Rose() {
        System.out.println("no args const of Rose");
    }

    @Override
    public void bloom() {
        System.out.println("Rose is blooming with red petals");
    }

    @Override
    public void smell() {
        System.out.println("Rose has a strong, sweet fragrance");
    }

    @Override
    public void absorbSunlight() {
        System.out.println("Rose is soaking in the morning sun");
    }

    @Override
    public void attractBees() {
        System.out.println("Rose is attracting honeybees");
    }

    @Override
    public void wilt() {
        System.out.println("Rose is wilting slowly");
    }
}
