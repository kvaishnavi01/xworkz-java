package com.xworkz.inheritance;

public class HealingPotion extends Potion {
    public HealingPotion() {
        System.out.println("no args const of HealingPotion");
    }

    @Override
    public void mixIngredients() {
        System.out.println("Healing potion is mixed with herbs and magic essence");
    }

    @Override
    public void boil() {
        System.out.println("Healing potion is gently boiled over a magic flame");
    }

    @Override
    public void bottle() {
        System.out.println("Healing potion is bottled in crystal flasks");
    }

    @Override
    public void label() {
        System.out.println("Healing potion label says: 'Restores 50 HP'");
    }

    @Override
    public void test() {
        System.out.println("Healing potion is tested on injured warriors");
    }
}
