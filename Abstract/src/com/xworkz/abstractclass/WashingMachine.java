package com.xworkz.abstractclass;

import com.xworkz.abstractclass.Appliance;

class WashingMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine is now ON.");
    }
}
