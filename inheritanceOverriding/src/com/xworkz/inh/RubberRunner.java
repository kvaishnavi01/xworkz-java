package com.xworkz.inh;

public class RubberRunner {
    public static void main(String[] args) {
        Rubber rubber = new Rubber();
        rubber.expand();

        System.out.println("------------------------");
        Rubber rubber1 = new Tyre();
        rubber1.expand();
        //rubber1.compress();   // error different data type


        System.out.println();
        Tyre tyre = new Tyre();
        tyre.expand();
        tyre.compress();


        MRFTyre mrfTyre = new MRFTyre();
        mrfTyre.expand();
        mrfTyre.compress();
        mrfTyre.radial();


        ArmyVehicle armyVehicle = new ArmyVehicle();
        armyVehicle.truck(rubber);
        armyVehicle.truck(rubber1);
        armyVehicle.truck(tyre);
        armyVehicle.truck(mrfTyre);

    }
}
