package com.xworkz.inheritance;

class Dog extends Animal {
    public Dog(){
        System.out.println("no arg const of Dog");
    }
    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void makeSound() {
        System.out.println("Dog makes a sound");
    }

    public void run() {
        System.out.println("Dog runs");
    }

    public void breathe() {
        System.out.println("Dog breathes");
    }

    public void bark(){
        System.out.println("dog barks");
    }
}