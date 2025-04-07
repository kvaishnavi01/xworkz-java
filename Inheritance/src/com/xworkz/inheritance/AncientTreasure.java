package com.xworkz.inheritance;

public class AncientTreasure extends Treasure {
    public AncientTreasure() {
        System.out.println("no args const of AncientTreasure");
    }

    @Override
    public void hide() {
        System.out.println("Ancient treasure is hidden in forgotten ruins");
    }

    @Override
    public void guard() {
        System.out.println("Ancient treasure is guarded by ancient curses");
    }

    @Override
    public void shine() {
        System.out.println("Ancient treasure gleams with historic artifacts");
    }

    @Override
    public void attractSeekers() {
        System.out.println("Ancient treasure attracts archaeologists and historians");
    }

    @Override
    public void holdValue() {
        System.out.println("Ancient treasure holds cultural and historical value");
    }

    public void revealHistory() {
        System.out.println("Ancient treasure reveals secrets of the past");
    }
}
