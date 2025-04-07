package com.xworkz.inheritance;

public class NonActive {
    public void fire(Volcano volcano){
        volcano.emitSmoke();
        volcano.erupt();
        volcano.formCrater();
        volcano.releaseGases();
        volcano.shakeGround();

        if(volcano instanceof ActiveVolcano){
            ActiveVolcano activeVolcano=(ActiveVolcano) volcano;
            activeVolcano.temp();
        }
    }
}
