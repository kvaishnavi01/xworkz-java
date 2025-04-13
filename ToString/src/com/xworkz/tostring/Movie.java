package com.xworkz.tostring;

public class Movie {
    private String name;
    private int duration;
    private char rating;

    public Movie(String name, int duration, char rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " duration is " + this.duration + " rating is " + this.rating;
    }

    @Override
    public int hashCode(){
        return 47;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Movie) {
                System.out.println("will compare.....");
                Movie m1 = this;
                Movie m2 = (Movie) obj;
                if(m1.name.equals(m2.name) && m1.duration == m2.duration) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
