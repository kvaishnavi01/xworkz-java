package com.xworkz.tostring;

public class WeatherReport {
    private String city;
    private double temperature;
    private boolean isRaining;

    public WeatherReport(String city, double temperature, boolean isRaining) {
        this.city = city;
        this.temperature = temperature;
        this.isRaining = isRaining;
    }

    @Override
    public String toString() {
        return "city is " + this.city + " temperature is " + this.temperature + " raining is " + this.isRaining;
    }
}
