package com.xworkz.inheritance;

public class Samsung {
    public void using(Gadget gadget){
        gadget.charge();
        gadget.connectToWifi();
        gadget.reset();
        gadget.turnOff();
        gadget.turnOn();

        if(gadget instanceof Smartphone){
            Smartphone smartphone=(Smartphone) gadget;
            smartphone.use();
        }
    }
}
