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
    public int hashCode(){
        return 95;
    }
}
