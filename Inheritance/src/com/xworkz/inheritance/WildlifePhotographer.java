package com.xworkz.inheritance;

public class WildlifePhotographer extends Photographer {
    public WildlifePhotographer() {
        System.out.println("no args const of WildlifePhotographer");
    }

    @Override
    public void capturePhoto() {
        System.out.println("Wildlife photographer captures animals in the wild");
    }

    @Override
    public void editPhoto() {
        System.out.println("Wildlife photographer enhances nature tones");
    }

    @Override
    public void printPhoto() {
        System.out.println("Wildlife photographer prints large nature frames");
    }

    @Override
    public void uploadPhoto() {
        System.out.println("Wildlife photographer uploads photos to NatGeo");
    }

    @Override
    public void organizeAlbum() {
        System.out.println("Wildlife photographer organizes animal categories");
    }
}
