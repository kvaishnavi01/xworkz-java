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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Remote) {
                System.out.println("will compare.....");
                Remote r1 = this;
                Remote r2 = (Remote) obj;
                if(r1.brand.equals(r2.brand) && r1.buttons == r2.buttons) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
