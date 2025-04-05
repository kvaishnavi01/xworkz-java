package com.xworkz.inheritance;

public class Sun extends Star {
    public Sun() {
        System.out.println("no args const of Sun");
    }

    @Override
    public void shine() {
        System.out.println("Sun shines brightly and lights Earth");
    }

    @Override
    public void emitHeat() {
        System.out.println("Sun emits intense heat and energy");
    }

    @Override
    public void undergoFusion() {
        System.out.println("Sun fuses hydrogen into helium");
    }

    @Override
    public void collapse() {
        System.out.println("Sun will become a red giant billions of years later");
    }

    @Override
    public void createGravity() {
        System.out.println("Sun's gravity keeps planets in orbit");
    }
}
