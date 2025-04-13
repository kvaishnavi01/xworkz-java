package com.xworkz.tostring;

public class USBDrive {
    private String brand;
    private int storage;
    private boolean isEncrypted;

    public USBDrive(String brand, int storage, boolean isEncrypted) {
        this.brand = brand;
        this.storage = storage;
        this.isEncrypted = isEncrypted;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand + " storage is " + this.storage + " encrypted is " + this.isEncrypted;
    }

    @Override
    public int hashCode() {
        return 95;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof USBDrive) {
                System.out.println("will compare.....");
                USBDrive u1 = this;
                USBDrive u2 = (USBDrive) obj;
                if (u1.brand.equals(u2.brand) && u1.storage == u2.storage && u1.isEncrypted == u2.isEncrypted) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
