package com.xworkz.inheritance;

public class Oven {
    public void cook(Machine machine){
        machine.maintain();
        machine.monitor();
        machine.operate();
        machine.stop();
        machine.start();

        if(machine instanceof  WashingMachine){
            WashingMachine washingMachine=(WashingMachine) machine;
            washingMachine.wash();
        }
    }
}
