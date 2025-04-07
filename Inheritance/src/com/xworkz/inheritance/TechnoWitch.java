package com.xworkz.inheritance;

public class TechnoWitch extends Witch {
    public TechnoWitch() {
        System.out.println("no args const of TechnoWitch");
    }

    @Override
    public void castSpell() {
        System.out.println("TechnoWitch is casting a digital spell");
    }

    @Override
    public void flyOnBroom() {
        System.out.println("TechnoWitch is flying on a hover-broom");
    }

    @Override
    public void brewPotion() {
        System.out.println("TechnoWitch is brewing a cyber potion");
    }

    @Override
    public void summonSpirits() {
        System.out.println("TechnoWitch is summoning AI spirits");
    }

    @Override
    public void vanish() {
        System.out.println("TechnoWitch vanishes using invisibility tech");
    }

    public void hackReality() {
        System.out.println("TechnoWitch is hacking reality using tech magic");
    }
}
