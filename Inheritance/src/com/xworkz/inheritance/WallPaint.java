package com.xworkz.inheritance;

public class WallPaint extends Paint {
    public WallPaint() {
        System.out.println("no args const of WallPaint");
    }

    @Override
    public void openCan() {
        System.out.println("WallPaint can is opened carefully");
    }

    @Override
    public void mix() {
        System.out.println("WallPaint is stirred for uniform color");
    }

    @Override
    public void apply() {
        System.out.println("WallPaint is applied to interior walls");
    }

    @Override
    public void dry() {
        System.out.println("WallPaint takes hours to dry");
    }

    @Override
    public void cleanBrush() {
        System.out.println("WallPaint brush is washed with water");
    }
}
