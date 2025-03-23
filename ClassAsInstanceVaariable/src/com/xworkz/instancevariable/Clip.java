package com.xworkz.instancevariable;

class Clip {
    ClipColor color;

    Clip(ClipColor color) {
        this.color = color;
    }

    void hold() {
        System.out.println("Holding clip of color: " + color);
    }
}
