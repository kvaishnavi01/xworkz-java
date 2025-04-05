package com.xworkz.inheritance;

public class MangoSeed extends Seed {
    public MangoSeed() {
        System.out.println("no args const of MangoSeed");
    }

    @Override
    public void grow() {
        System.out.println("MangoSeed grows into a mango tree");
    }

    @Override
    public void absorbWater() {
        System.out.println("MangoSeed absorbs a lot of moisture");
    }

    @Override
    public void germinate() {
        System.out.println("MangoSeed starts germinating slowly");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Mango plant starts making its food");
    }

    @Override
    public void breakShell() {
        System.out.println("MangoSeed cracks open to sprout");
    }
}
