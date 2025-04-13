package com.xworkz.tostring;

public class Hotel {
    private String name;
    private int stars;
    private boolean hasWifi;

    public Hotel(String name, int stars, boolean hasWifi) {
        this.name = name;
        this.stars = stars;
        this.hasWifi = hasWifi;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " stars are " + this.stars + " wifi is " + this.hasWifi;
    }

    @Override
    public int hashCode(){
        return 52;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Hotel) {
                System.out.println("will compare.....");
                Hotel h1 = this;
                Hotel h2 = (Hotel) obj;
                if(h1.name.equals(h2.name) && h1.hasWifi == h2.hasWifi) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
