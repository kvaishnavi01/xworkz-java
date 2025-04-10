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
    public int hashCode(){
        return 88;
    }
}
