package com.xworkz.tostring;

public class Smartwatch {
    private String brand;
    private int batteryLife;
    private boolean waterResistant;

    public Smartwatch(String brand, int batteryLife, boolean waterResistant) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.waterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " battery life is " + this.batteryLife + " water resistant is " + this.waterResistant;
    }

    @Override
    public int hashCode() {
        return 68;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Smartwatch) {
                System.out.println("will compare.....");
                Smartwatch s1 = this;
                Smartwatch s2 = (Smartwatch) obj;
                if (s1.brand.equals(s2.brand) && s1.batteryLife == s2.batteryLife && s1.waterResistant == s2.waterResistant) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
