package com.xworkz.inheritance;

public class SpellCaster {
    public void observe(Witch witch) {
        witch.castSpell();
        witch.flyOnBroom();
        witch.brewPotion();
        witch.summonSpirits();
        witch.vanish();

        if (witch instanceof TechnoWitch) {
            TechnoWitch techno = (TechnoWitch) witch;
            techno.hackReality();
        }
    }
}
