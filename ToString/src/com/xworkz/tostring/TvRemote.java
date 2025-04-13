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

    @Override
    public int hashCode() {
        return 84;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof TvRemote) {
                System.out.println("will compare.....");
                TvRemote r1 = this;
                TvRemote r2 = (TvRemote) obj;
                if (r1.brand.equals(r2.brand) && r1.buttonCount == r2.buttonCount && r1.hasVoiceControl == r2.hasVoiceControl) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
