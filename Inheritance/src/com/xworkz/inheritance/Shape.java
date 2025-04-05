package com.xworkz.inheritance;

public class Shape {
    public Shape() {
        System.out.println("no args const of Shape");
    }

    public void draw() {
        System.out.println("Drawing a generic shape");
    }

    public void calculateArea() {
        System.out.println("Calculating area of shape");
    }

    public void calculatePerimeter() {
        System.out.println("Calculating perimeter of shape");
    }

    public void displayType() {
        System.out.println("This is a 2D shape");
    }

    public void resize() {
        System.out.println("Resizing the shape");
    }
}
