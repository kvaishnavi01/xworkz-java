package com.xworkz.inheritance;

public class Rain extends Weather {
    public Rain() {
        System.out.println("no args const of Rain");
    }

    @Override
    public void change() {
        System.out.println("Rain starts as clouds gather");
    }

    @Override
    public void measureTemperature() {
        System.out.println("Temperature drops during rain");
    }

    @Override
    public void checkHumidity() {
        System.out.println("Humidity is very high during rain");
    }

    @Override
    public void forecast() {
        System.out.println("Rain is forecasted using radar");
    }

    @Override
    public void display() {
        System.out.println("Rainy weather is displayed with raindrop icons");
    }
}
