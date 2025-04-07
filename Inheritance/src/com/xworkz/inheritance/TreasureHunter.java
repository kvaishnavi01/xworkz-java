package com.xworkz.inheritance;

public class TreasureHunter {
    public void inspect(Treasure treasure) {
        treasure.hide();
        treasure.guard();
        treasure.shine();
        treasure.attractSeekers();
        treasure.holdValue();

        if (treasure instanceof AncientTreasure) {
            AncientTreasure ancient = (AncientTreasure) treasure;
            ancient.revealHistory();
        }
    }
}
