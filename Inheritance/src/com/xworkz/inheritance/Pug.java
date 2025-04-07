package com.xworkz.inheritance;

public class Pug {
    public void behaviour(Animal animal){
        animal.eat();
        animal.breathe();
        animal.run();
        animal.sleep();
        animal.makeSound();

        if( animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.bark();
        }
    }
}
