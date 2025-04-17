package com.xworkz.interfaces;

public class MechanicalKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing on mechanical keyboard.");
    }
    public void backlight() {
        System.out.println("Enabling keyboard backlight.");
    }
    public void connect() {
        System.out.println("Connecting the keyboard to PC.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
