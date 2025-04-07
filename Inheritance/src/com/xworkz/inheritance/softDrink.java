package com.xworkz.inheritance;

public class softDrink {
    public void flavor(Beverage beverage){
        beverage.drink();
        beverage.chill();
        beverage.openCap();
        beverage.pour();
        beverage.shake();

        if (beverage instanceof  EnergyDrink){
            EnergyDrink energyDrink=(EnergyDrink) beverage;
            energyDrink.sip();
        }
    }
}
