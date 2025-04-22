package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Chocolate;

public class Pizzeria {
    private Chocolate.Pizza pizza;

    public Pizzeria(Chocolate.Pizza pizza) {
        System.out.println("Pizzeria with Pizza created");
        this.pizza = pizza;
    }

    public void serve() {
        System.out.println("Pizzeria is using pizza");
        if (pizza != null) {
            this.pizza.top();
        }
    }
}