package com.xworkz.inheritance;

public class Brush {
    public Brush() {
        System.out.println("no args const of Brush");
    }

    public void dip() {
        System.out.println("Brush is dipped in paint");
    }

    public void stroke() {
        System.out.println("Brush makes strokes on canvas");
    }

    public void clean() {
        System.out.println("Brush is cleaned after use");
    }

    public void dry() {
        System.out.println("Brush is drying in open air");
    }

    public void hold() {
        System.out.println("Brush is held by the artist");
    }
}
