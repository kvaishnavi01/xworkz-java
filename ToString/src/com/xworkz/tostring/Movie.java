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
}
