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

    @Override
    public int hashCode(){
        return 46;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof WeatherReport) {
                System.out.println("will compare.....");
                WeatherReport w1 = this;
                WeatherReport w2 = (WeatherReport) obj;
                if(w1.city.equals(w2.city) && w1.temperature == w2.temperature) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
