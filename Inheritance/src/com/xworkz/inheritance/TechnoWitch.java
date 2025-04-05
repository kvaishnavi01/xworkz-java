package com.xworkz.inheritance;

public class TechnoWitch extends Witch {
    public TechnoWitch() {
        System.out.println("no args const of TechnoWitch");
    }

    @Override
    public void castSpell() {
        System.out.println("TechnoWitch casts a spell using neural networks");
    }

    @Override
    public void brewPotion() {
        System.out.println("TechnoWitch brews code-infused potions in a VR cauldron");
    }

    @Override
    public void rideBroom() {
        System.out.println("TechnoWitch rides a hoverboard with AI navigation");
    }

    @Override
    public void summonSpirits() {
        System.out.println("TechnoWitch summons digital ghosts through quantum circuits");
    }

    @Override
    public void readRunes() {
        System.out.println("TechnoWitch reads runes using augmented reality overlays");
    }
}
