package com.xworkz.inheritance;

public class Circle extends Shape {
    public Circle() {
        System.out.println("no args const of Circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area = π × r²");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter = 2 × π × r");
    }

    @Override
    public void displayType() {
        System.out.println("This is a round shape");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the circle");
    }
}
