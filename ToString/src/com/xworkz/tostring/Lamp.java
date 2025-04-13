package com.xworkz.tostring;

public class Lamp {
    private String type;
    private String color;
    private boolean isDimmable;

    public Lamp(String type, String color, boolean isDimmable) {
        this.type = type;
        this.color = color;
        this.isDimmable = isDimmable;
    }

    @Override
    public String toString() {
        return "type is " + this.type +
                " color is " + this.color +
                " dimmable is " + this.isDimmable;
    }

    @Override
    public int hashCode(){
        return 22;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Lamp) {
                System.out.println("will compare.....");
                Lamp l1 = this;
                Lamp l2 = (Lamp) obj;
                if(l1.color.equals(l2.color)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
