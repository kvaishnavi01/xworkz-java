package com.xworkz.inheritance;

public class Exhibition {
    public void showcase(Photographer photographer) {
        photographer.takePhoto();
        photographer.editPhoto();
        photographer.setupEquipment();
        photographer.selectLocation();
        photographer.processImages();

        if (photographer instanceof WildlifePhotographer) {
            WildlifePhotographer wildlife = (WildlifePhotographer) photographer;
            wildlife.camouflage();
        }
    }
}
