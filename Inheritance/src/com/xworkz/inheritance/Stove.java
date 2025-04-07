package com.xworkz.inheritance;

public class Stove {
    public void fire(Appliance appliance){
        appliance.displayStatus();
        appliance.checkPower();
        appliance.operate();
        appliance.switchOff();
        appliance.switchOn();

        if( appliance instanceof Microwave){
            Microwave microwave=(Microwave) appliance;
            microwave.heat();
        }
    }
}
