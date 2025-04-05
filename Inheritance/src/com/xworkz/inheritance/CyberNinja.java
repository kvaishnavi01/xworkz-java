package com.xworkz.inheritance;

public class CyberNinja extends Ninja {
    public CyberNinja() {
        System.out.println("no args const of CyberNinja");
    }

    @Override
    public void sneak() {
        System.out.println("CyberNinja activates cloaking");
    }

    @Override
    public void throwShuriken() {
        System.out.println("CyberNinja launches smart-shuriken");
    }

    @Override
    public void disguise() {
        System.out.println("CyberNinja hacks surveillance");
    }

    @Override
    public void assassinate() {
        System.out.println("CyberNinja uses nano-blade");
    }

    @Override
    public void escape() {
        System.out.println("CyberNinja teleports away");
    }
}