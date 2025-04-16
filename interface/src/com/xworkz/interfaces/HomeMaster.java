package com.xworkz.interfaces;

class HomeMaster implements Bottle, Chair, Mug, Notebook, Spoon {
    public void fillWater() {
        System.out.println("HomeMaster: Filling bottle with water.");
    }
    public void drinkWater() {
        System.out.println("HomeMaster: Drinking water from bottle.");
    }
    public void recycle() {
        System.out.println("HomeMaster: Recycling used bottle.");
    }
    public void sit() {
        System.out.println("HomeMaster: Sitting on a chair.");
    }
    public void recline() {
        System.out.println("HomeMaster: Reclining chair for relaxation.");
    }
    public void roll() {
        System.out.println("HomeMaster: Rolling chair to workspace.");
    }
    public void fill() {
        System.out.println("HomeMaster: Filling mug with tea.");
    }
    public void drink() {
        System.out.println("HomeMaster: Drinking tea from mug.");
    }
    public void wash() {
        System.out.println("HomeMaster: Washing mug after use.");
    }
    public void open() {
        System.out.println("HomeMaster: Opening notebook for notes.");
    }
    public void writePage() {
        System.out.println("HomeMaster: Writing in notebook.");
    }
    public void close() {
        System.out.println("HomeMaster: Closing notebook.");
    }
    public void scoop() {
        System.out.println("HomeMaster: Scooping food with spoon.");
    }
    public void stir() {
        System.out.println("HomeMaster: Stirring coffee with spoon.");
    }
    public void clean() {
        System.out.println("HomeMaster: Cleaning spoon after use.");
    }
}