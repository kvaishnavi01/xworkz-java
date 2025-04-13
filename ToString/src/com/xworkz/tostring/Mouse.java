package com.xworkz.tostring;

public class Mouse {
    private String brand;
    private boolean isWireless;
    private int dpi;

    public Mouse(String brand, boolean isWireless, int dpi) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "brand is " + this.brand +
                " wireless is " + this.isWireless +
                " DPI is " + this.dpi;
    }

    @Override
    public int hashCode(){
        return 23;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Mouse) {
                System.out.println("will compare.....");
                Mouse m1 = this;
                Mouse m2 = (Mouse) obj;
                if(m1.brand.equals(m2.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
