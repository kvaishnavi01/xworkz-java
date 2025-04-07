package com.xworkz.inheritance;

public class PotionLab {
    public void inspect(Potion potion) {
        potion.mix();
        potion.bottle();
        potion.label();
        potion.store();
        potion.test();

        if (potion instanceof HealingPotion) {
            HealingPotion heal = (HealingPotion) potion;
            heal.apply();
        }
    }
}
