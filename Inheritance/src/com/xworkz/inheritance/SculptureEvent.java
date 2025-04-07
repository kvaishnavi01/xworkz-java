package com.xworkz.inheritance;

public class SculptureEvent {
    public void manage(Sculpture sculpture) {
        sculpture.carve();
        sculpture.polish();
        sculpture.display();
        sculpture.transport();
        sculpture.restore();

        if (sculpture instanceof IceSculpture) {
            IceSculpture ice = (IceSculpture) sculpture;
            ice.meltTime();
        }
    }
}
