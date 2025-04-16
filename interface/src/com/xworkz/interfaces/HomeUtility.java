package com.xworkz.interfaces;

class HomeUtility implements Bottle, Chair, Mug, Notebook, Spoon {
    public void fillWater() {
        System.out.println("HomeUtility: Filling bottle with water.");
    }
    public void drinkWater() {
        System.out.println("HomeUtility: Drinking from bottle.");
    }
    public void recycle() {
        System.out.println("HomeUtility: Recycling plastic bottle.");
    }
    public void sit() {
        System.out.println("HomeUtility: Sitting on chair.");
    }
    public void recline() {
        System.out.println("HomeUtility: Reclining chair for comfort.");
    }
    public void roll() {
        System.out.println("HomeUtility: Rolling chair to desk.");
    }
    public void fill() {
        System.out.println("HomeUtility: Filling mug with coffee.");
    }
    public void drink() {
        System.out.println("HomeUtility: Drinking from mug.");
    }
    public void wash() {
        System.out.println("HomeUtility: Washing mug after use.");
    }
    public void open() {
        System.out.println("HomeUtility: Opening notebook to write.");
    }
    public void writePage() {
        System.out.println("HomeUtility: Writing notes in notebook.");
    }
    public void close() {
        System.out.println("HomeUtility: Closing notebook after use.");
    }
    public void scoop() {
        System.out.println("HomeUtility: Scooping soup with spoon.");
    }
    public void stir() {
        System.out.println("HomeUtility: Stirring tea with spoon.");
    }
    public void clean() {
        System.out.println("HomeUtility: Cleaning spoon after use.");
    }
}