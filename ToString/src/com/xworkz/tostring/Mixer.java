package com.xworkz.tostring;

public class Mixer {
    private String brand;
    private int channels;
    private boolean hasBluetooth;

    public Mixer(String brand, int channels, boolean hasBluetooth) {
        this.brand = brand;
        this.channels = channels;
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " channels are " + this.channels + " bluetooth is " + this.hasBluetooth;
    }

    @Override
    public int hashCode() {
        return 76;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mixer) {
                System.out.println("will compare.....");
                Mixer m1 = this;
                Mixer m2 = (Mixer) obj;
                if (m1.brand.equals(m2.brand) && m1.channels == m2.channels && m1.hasBluetooth == m2.hasBluetooth) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
