package com.xworkz.inheritance;

public class MangoTree extends Tree {
    public MangoTree() {
        System.out.println("no args const of MangoTree");
    }

    @Override
    public void grow() {
        System.out.println("Mango tree is growing with mangoes");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Mango tree is converting sunlight to energy");
    }

    @Override
    public void provideShade() {
        System.out.println("Mango tree provides cool shade");
    }

    @Override
    public void absorbWater() {
        System.out.println("Mango tree is absorbing water through roots");
    }

    @Override
    public void releaseOxygen() {
        System.out.println("Mango tree releases fresh oxygen");
    }

    public void pluck(){
        System.out.println("Mango plucked");
    }
}
