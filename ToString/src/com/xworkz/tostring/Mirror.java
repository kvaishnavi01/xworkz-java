package com.xworkz.tostring;

public class Mirror {
    private String shape;
    private int height;
    private boolean isWallMounted;

    public Mirror(String shape, int height, boolean isWallMounted) {
        this.shape = shape;
        this.height = height;
        this.isWallMounted = isWallMounted;
    }

    @Override
    public String toString() {
        return "shape is " + this.shape + " height is " + this.height + " wall mounted is " + this.isWallMounted;
    }

    @Override
    public int hashCode() {
        return 88;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mirror) {
                System.out.println("will compare.....");
                Mirror m1 = this;
                Mirror m2 = (Mirror) obj;
                if (m1.shape.equals(m2.shape) && m1.height == m2.height && m1.isWallMounted == m2.isWallMounted) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
