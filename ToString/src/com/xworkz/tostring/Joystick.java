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

    @Override
    public int hashCode() {
        return 96;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Joystick) {
                System.out.println("will compare.....");
                Joystick j1 = this;
                Joystick j2 = (Joystick) obj;
                if (j1.model.equals(j2.model) && j1.buttons == j2.buttons && j1.isWireless == j2.isWireless) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
