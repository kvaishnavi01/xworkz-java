package com.pizza;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraToppings() {
        // Do nothing
    }

    @Override
    public void addExtraCheese() {
        // Do nothing
    }
}
