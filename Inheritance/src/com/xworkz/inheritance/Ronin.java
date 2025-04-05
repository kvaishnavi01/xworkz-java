package com.xworkz.inheritance;

public class Ronin extends Samurai {
    public Ronin() {
        System.out.println("no args const of Ronin");
    }

    @Override
    public void drawSword() {
        System.out.println("Ronin quickly unsheathes blade");
    }

    @Override
    public void meditate() {
        System.out.println("Ronin reflects on past mistakes");
    }

    @Override
    public void fight() {
        System.out.println("Ronin fights without master");
    }

    @Override
    public void honor() {
        System.out.println("Ronin follows personal code");
    }

    @Override
    public void seppuku() {
        System.out.println("Ronin refuses dishonorable death");
    }
}