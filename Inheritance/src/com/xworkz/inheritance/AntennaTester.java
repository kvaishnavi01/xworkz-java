package com.xworkz.inheritance;

public class AntennaTester {
    public void test(Antenna antenna) {
        antenna.transmit();
        antenna.receive();
        antenna.rotate();
        antenna.align();
        antenna.calibrate();

        if (antenna instanceof ParabolicAntenna) {
            ParabolicAntenna parabolic = (ParabolicAntenna) antenna;
            parabolic.focusSignal();
        }
    }
}
