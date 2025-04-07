package com.xworkz.inheritance;

public class WildlifePhotographer extends Photographer {
    public WildlifePhotographer() {
        System.out.println("no args const of WildlifePhotographer");
    }

    @Override
    public void takePhoto() {
        System.out.println("WildlifePhotographer captures animals in nature");
    }

    @Override
    public void editPhoto() {
        System.out.println("WildlifePhotographer enhances wildlife shots");
    }

    @Override
    public void setupEquipment() {
        System.out.println("WildlifePhotographer sets up long-range cameras");
    }

    @Override
    public void selectLocation() {
        System.out.println("WildlifePhotographer picks wildlife reserves");
    }

    @Override
    public void processImages() {
        System.out.println("WildlifePhotographer processes raw wildlife images");
    }

    public void camouflage() {
        System.out.println("WildlifePhotographer uses camouflage to stay hidden");
    }
}
