package com.xworkz.interfaces;

public class GuardDesigner implements SecurityGuard, FashionDesigner {
    public void patrolArea() {
        System.out.println("Patrols fashion runway.");
    }

    public void monitorCCTV() {
        System.out.println("Monitors backstage dressing rooms.");
    }

    public void checkID() {
        System.out.println("Checks designer badges.");
    }

    @Override
    public String getDescription() {
        return SecurityGuard.super.getDescription();
    }

    public void sketchDesigns() {
        System.out.println("Sketches security uniforms.");
    }

    public void chooseFabric() {
        System.out.println("Chooses bulletproof fabric.");
    }

    public void attendFashionShow() {
        System.out.println("Attends fashion shows as security and designer.");
    }
}
