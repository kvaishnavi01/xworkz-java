package com.xworkz.interfaces;

public class MumbaikarPavBhaji implements PavBhaji {
    public void cookBhaji() {
        System.out.println("Cooks bhaji with lots of butter.");
    }

    public void toastPav() {
        System.out.println("Toasts pav with ghee.");
    }

    public void garnish() {
        System.out.println("Garnishes bhaji with coriander and onion.");
    }
    public String getDescription() {
        return "This is a default method";
    }
}
