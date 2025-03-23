package com.xworkz.javareferenceandvariable;

public class State {
    String stateName;
    String capitalCity;
    int residents;
    double landArea;

    State(String stateName, String capitalCity, int residents, double landArea) {
        this.stateName = stateName;
        this.capitalCity = capitalCity;
        this.residents = residents;
        this.landArea = landArea;
        System.out.println("State: " + this.stateName + " | Capital: " + this.capitalCity +
                " | Residents: " + this.residents + " | Area: " + this.landArea);
    }

    void display() {
        System.out.println("Showing state details");
    }
}