package com.xworkz.inheritance;

public class Painter extends Artist {
    public Painter() {
        System.out.println("no args const of Painter");
    }

    @Override
    public void draw() {
        System.out.println("Painter is drawing on canvas");
    }

    @Override
    public void paint() {
        System.out.println("Painter is painting with oil colors");
    }

    @Override
    public void sketch() {
        System.out.println("Painter is sketching a portrait");
    }

    @Override
    public void mixColors() {
        System.out.println("Painter is mixing vibrant colors");
    }

    @Override
    public void displayArt() {
        System.out.println("Painter is displaying in an art gallery");
    }
}
