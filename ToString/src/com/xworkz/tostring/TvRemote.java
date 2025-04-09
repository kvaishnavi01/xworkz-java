package com.xworkz.tostring;

public class TvRemote {
    private String brand;
    private int buttonCount;
    private boolean hasVoiceControl;

    public TvRemote(String brand, int buttonCount, boolean hasVoiceControl) {
        this.brand = brand;
        this.buttonCount = buttonCount;
        this.hasVoiceControl = hasVoiceControl;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " button count is " + this.buttonCount + " voice control is " + this.hasVoiceControl;
    }
}
