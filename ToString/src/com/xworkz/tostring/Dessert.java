package com.xworkz.tostring;

public class Dessert {
    private String name;
    private int calories;
    private boolean isCold;

    public Dessert(String name, int calories, boolean isCold) {
        this.name = name;
        this.calories = calories;
        this.isCold = isCold;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " calories are " + this.calories + " cold is " + this.isCold;
    }

    @Override
    public int hashCode() {
        return 69;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Dessert) {
                System.out.println("will compare.....");
                Dessert d1 = this;
                Dessert d2 = (Dessert) obj;
                if (d1.name.equals(d2.name) && d1.calories == d2.calories && d1.isCold == d2.isCold) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
