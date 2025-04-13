package com.xworkz.tostring;

public class Torchlight {
    private String brand;
    private int batteryLife;
    private boolean isRechargeable;

    public Torchlight(String brand, int batteryLife, boolean isRechargeable) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " battery life is " + this.batteryLife + " rechargeable is " + this.isRechargeable;
    }

    @Override
    public int hashCode() {
        return 97;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Torchlight) {
                System.out.println("will compare.....");
                Torchlight t1 = this;
                Torchlight t2 = (Torchlight) obj;
                if (t1.brand.equals(t2.brand) && t1.batteryLife == t2.batteryLife && t1.isRechargeable == t2.isRechargeable) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
