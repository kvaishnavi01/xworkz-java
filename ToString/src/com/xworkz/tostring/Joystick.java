package com.xworkz.tostring;

public class Joystick {
    private String model;
    private int buttons;
    private boolean isWireless;

    public Joystick(String model, int buttons, boolean isWireless) {
        this.model = model;
        this.buttons = buttons;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "model is " + this.model + " buttons are " + this.buttons + " wireless is " + this.isWireless;
    }
}
