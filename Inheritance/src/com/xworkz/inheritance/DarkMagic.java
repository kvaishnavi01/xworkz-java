package com.xworkz.inheritance;

public class DarkMagic extends Magic {
    public DarkMagic() {
        System.out.println("no args const of DarkMagic");
    }

    @Override
    public void castSpell() {
        System.out.println("Casting forbidden spell");
    }

    @Override
    public void vanishObject() {
        System.out.println("Erasing objects from existence");
    }

    @Override
    public void levitate() {
        System.out.println("Levitating entire buildings");
    }

    @Override
    public void predict() {
        System.out.println("Seeing apocalyptic visions");
    }

    @Override
    public void teleport() {
        System.out.println("Instant shadow teleportation");
    }
}