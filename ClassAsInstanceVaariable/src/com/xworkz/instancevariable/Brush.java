package com.xworkz.instancevariable;

class Brush {
    BrushColor color;

    Brush(BrushColor color) {
        this.color = color;
    }

    void clean() {
        System.out.println("Cleaning with brush of color: " + color);
    }

    void scrub() {
        System.out.println("Scrubbing using brush of color: " + color);
    }
}
