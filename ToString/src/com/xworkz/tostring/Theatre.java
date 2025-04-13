package com.xworkz.tostring;

public class Theatre {
    private String name;
    private byte screens;
    private short seatingCapacity;

    public Theatre(String name, byte screens, short seatingCapacity) {
        this.name = name;
        this.screens = screens;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " screens are " + this.screens + " capacity is " + this.seatingCapacity;
    }

    @Override
    public int hashCode() {
        return 63;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Theatre) {
                System.out.println("will compare.....");
                Theatre t1 = this;
                Theatre t2 = (Theatre) obj;
                if (t1.name.equals(t2.name) && t1.screens == t2.screens && t1.seatingCapacity == t2.seatingCapacity) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
