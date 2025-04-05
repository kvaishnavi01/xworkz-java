package com.xworkz.inheritance;

public class PaintBrush extends Brush {
    public PaintBrush() {
        System.out.println("no args const of PaintBrush");
    }

    @Override
    public void dip() {
        System.out.println("PaintBrush dipped in watercolors");
    }

    @Override
    public void stroke() {
        System.out.println("PaintBrush strokes gently on canvas");
    }

    @Override
    public void clean() {
        System.out.println("PaintBrush washed with warm water");
    }

    @Override
    public void dry() {
        System.out.println("PaintBrush is left to dry on towel");
    }

    @Override
    public void hold() {
        System.out.println("PaintBrush is held by a painter");
    }
}
