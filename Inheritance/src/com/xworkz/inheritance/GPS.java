package com.xworkz.inheritance;

public class GPS {
    public void direction(Satellite satellite){
        satellite.adjustPosition();
        satellite.monitorSystems();
        satellite.orbit();
        satellite.receiveSignal();
        satellite.transmitData();

        if(satellite instanceof WeatherSatellite){
            WeatherSatellite weatherSatellite=(WeatherSatellite) satellite;
            weatherSatellite.check();
        }
    }
}
