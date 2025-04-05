package com.xworkz.inheritance;

public class ActiveVolcano extends Volcano {
    public ActiveVolcano() {
        System.out.println("no args const of ActiveVolcano");
    }

    @Override
    public void erupt() {
        System.out.println("Active volcano is violently erupting");
    }

    @Override
    public void emitSmoke() {
        System.out.println("Active volcano is releasing thick black smoke");
    }

    @Override
    public void shakeGround() {
        System.out.println("Active volcano is causing tremors");
    }

    @Override
    public void releaseGases() {
        System.out.println("Active volcano is releasing sulfur gases");
    }

    @Override
    public void formCrater() {
        System.out.println("Active volcano has formed a wide crater");
    }
}
