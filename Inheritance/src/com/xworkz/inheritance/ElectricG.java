package com.xworkz.inheritance;

public class ElectricG {
    public void connect(Musician musician){
        musician.compose();
        musician.perform();
        musician.playInstrument();
        musician.practice();
        musician.tuneInstrument();

        if(musician instanceof  Guitarist){
            Guitarist guitarist=(Guitarist) musician;
            guitarist.Play();
        }
    }
}
