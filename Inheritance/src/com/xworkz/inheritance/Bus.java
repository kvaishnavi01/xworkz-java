package com.xworkz.inheritance;

public class Bus {
    public void drive(Transport transport){
        transport.load();
        transport.move();
        transport.start();
        transport.unload();
        transport.stop();

        if(transport instanceof  Airplane){
            Airplane airplane=(Airplane) transport;
            airplane.checkin();
        }
    }
}
