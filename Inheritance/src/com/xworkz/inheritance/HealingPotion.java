package com.xworkz.inheritance;

public class HealingPotion extends Potion {
    public HealingPotion() {
        System.out.println("no args const of HealingPotion");
    }

    @Override
    public void mix() {
        System.out.println("Healing potion ingredients are carefully mixed");
    }

    @Override
    public void bottle() {
        System.out.println("Healing potion is sealed in glass bottles");
    }

    @Override
    public void label() {
        System.out.println("Healing potion is labeled with dosage info");
    }

    @Override
    public void store() {
        System.out.println("Healing potion is stored in a cool place");
    }

    @Override
    public void test() {
        System.out.println("Healing potion is tested on injured subjects");
    }

    public void apply() {
        System.out.println("Healing potion is applied to wounds for recovery");
    }
}
