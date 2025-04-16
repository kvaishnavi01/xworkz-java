package com.xworkz.interfaces;

class EverydayUtility implements Pencil, Notebook, Mug, Spoon, Chair {
    public void write() {
        System.out.println("EverydayUtility: Writing notes with pencil.");
    }

    public void erase() {
        System.out.println("EverydayUtility: Erasing pencil marks.");
    }

    public void sharpen() {
        System.out.println("EverydayUtility: Sharpening pencil with a sharpener.");
    }

    public void open() {
        System.out.println("EverydayUtility: Opening notebook to a new page.");
    }

    public void writePage() {
        System.out.println("EverydayUtility: Writing ideas in notebook.");
    }

    public void close() {
        System.out.println("EverydayUtility: Closing notebook after use.");
    }

    public void fill() {
        System.out.println("EverydayUtility: Filling mug with hot coffee.");
    }

    public void drink() {
        System.out.println("EverydayUtility: Drinking coffee from mug.");
    }

    public void wash() {
        System.out.println("EverydayUtility: Washing mug after use.");
    }

    public void scoop() {
        System.out.println("EverydayUtility: Scooping cereal with spoon.");
    }

    public void stir() {
        System.out.println("EverydayUtility: Stirring sugar in tea with spoon.");
    }

    public void clean() {
        System.out.println("EverydayUtility: Cleaning spoon after eating.");
    }

    public void sit() {
        System.out.println("EverydayUtility: Sitting on a comfortable chair.");
    }

    public void recline() {
        System.out.println("EverydayUtility: Reclining chair for relaxation.");
    }

    public void roll() {
        System.out.println("EverydayUtility: Rolling chair to the desk.");
    }
}