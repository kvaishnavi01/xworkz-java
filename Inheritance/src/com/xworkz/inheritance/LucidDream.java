package com.xworkz.inheritance;

public class LucidDream extends Dream {
    public LucidDream() {
        System.out.println("no args const of LucidDream");
    }

    @Override
    public void start() {
        System.out.println("Lucid Dream is beginning with awareness");
    }

    @Override
    public void shiftScene() {
        System.out.println("Lucid Dreamer is controlling the scene shift");
    }

    @Override
    public void feelReal() {
        System.out.println("Lucid Dream feels ultra-real");
    }

    @Override
    public void fade() {
        System.out.println("Lucid Dream is being stabilized to avoid fading");
    }

    @Override
    public void end() {
        System.out.println("Lucid Dream ends with memory recall");
    }

    public void controlDream() {
        System.out.println("Lucid Dreamer is controlling the dream events");
    }
}
