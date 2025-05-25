package com.pizza;

public class Pizza {
    protected int price;
    protected Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingAdded = 150;
    private int backPack = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isBackPackAdded = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingAdded = true;
        this.price += extraToppingAdded;
    }

    public void takeAway() {
        isBackPackAdded = true;
        this.price += backPack;
    }

    public String getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Pizza : ").append(basePizzaPrice).append("<br>");
        if (isExtraCheeseAdded) {
            bill.append("Extra cheese added: ").append(extraCheesePrice).append("<br>");
        }
        if (isExtraToppingAdded) {
            bill.append("Extra topping added: ").append(extraToppingAdded).append("<br>");
        }
        if (isBackPackAdded) {
            bill.append("Takeaway charges: ").append(backPack).append("<br>");
        }
        bill.append("Total Bill: ").append(this.price).append("<br>");
        return bill.toString();
    }
}
