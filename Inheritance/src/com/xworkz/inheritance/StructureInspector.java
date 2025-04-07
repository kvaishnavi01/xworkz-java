package com.xworkz.inheritance;

public class StructureInspector {
    public void inspect(Structure structure) {
        structure.build();
        structure.supportWeight();
        structure.withstandWeather();
        structure.provideShelter();
        structure.maintain();

        if (structure instanceof Bridge) {
            Bridge bridge = (Bridge) structure;
            bridge.allowTransport();
        }
    }
}
