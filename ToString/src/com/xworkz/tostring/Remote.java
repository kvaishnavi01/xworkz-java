package com.xworkz.tostring;

public class Remote {
    private String brand;
    private int buttons;
    private boolean isRechargeable;

    public Remote(String brand, int buttons, boolean isRechargeable) {
        this.brand = brand;
        this.buttons = buttons;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " buttons are " + this.buttons + " rechargeable is " + this.isRechargeable;
    }
    @Override
    public int hashCode(){
        return 60;
    }
}
