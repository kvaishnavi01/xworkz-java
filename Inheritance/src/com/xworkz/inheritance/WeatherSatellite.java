package com.xworkz.inheritance;

public class WeatherSatellite extends Satellite {
    public WeatherSatellite() {
        System.out.println("no args const of WeatherSatellite");
    }

    @Override
    public void orbit() {
        System.out.println("Weather Satellite is in geostationary orbit");
    }

    @Override
    public void transmitData() {
        System.out.println("Weather Satellite is transmitting weather data");
    }

    @Override
    public void receiveSignal() {
        System.out.println("Weather Satellite is receiving calibration signals");
    }

    @Override
    public void adjustPosition() {
        System.out.println("Weather Satellite is repositioning for better coverage");
    }

    @Override
    public void monitorSystems() {
        System.out.println("Weather Satellite is checking thermal sensors");
    }
}
