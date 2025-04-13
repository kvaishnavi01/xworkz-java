package com.xworkz.tostring;

public class Guitar {
    private String type;
    private int strings;
    private boolean isElectric;

    public Guitar(String type, int strings, boolean isElectric) {
        this.type = type;
        this.strings = strings;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " strings are " + this.strings + " electric is " + this.isElectric;
    }

    @Override
    public int hashCode(){
        return 47;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Guitar) {
                System.out.println("will compare.....");
                Guitar g1 = this;
                Guitar g2 = (Guitar) obj;
                if(g1.type.equals(g2.type) && g1.strings == g2.strings) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
