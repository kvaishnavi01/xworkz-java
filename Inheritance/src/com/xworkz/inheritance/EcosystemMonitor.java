package com.xworkz.inheritance;

public class EcosystemMonitor {
    public void inspect(Ecosystem ecosystem) {
        ecosystem.supportLife();
        ecosystem.regulateClimate();
        ecosystem.cycleNutrients();
        ecosystem.maintainSoil();
        ecosystem.purifyWater();

        if (ecosystem instanceof RainforestEcosystem) {
            RainforestEcosystem rf = (RainforestEcosystem) ecosystem;
            rf.produceOxygen();
        }
    }
}
