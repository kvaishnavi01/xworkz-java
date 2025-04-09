package com.xworkz.tostring;

public class Lamp {
    private String type;
    private String color;
    private boolean isDimmable;

    public Lamp(String type, String color, boolean isDimmable) {
        this.type = type;
        this.color = color;
        this.isDimmable = isDimmable;
    }

    @Override
    public String toString() {
        return "type is " + this.type +
                " color is " + this.color +
                " dimmable is " + this.isDimmable;
    }
}
