package com.xworkz.javareferenceandvariable;

public class Country {
    String countryName;
    String spokenLanguage;
    Double totalPopulation;
    int totalStates;
    PrimeMinister leader;

    public Country(String countryName, String spokenLanguage, Double totalPopulation, int totalStates) {
        System.out.println("Executing country constructor");
        this.countryName = countryName;
        this.spokenLanguage = spokenLanguage;
        this.totalPopulation = totalPopulation;
        this.totalStates = totalStates;
        this.leader = new PrimeMinister("Narendra", "Bharat", 2023, 2028);
    }

    void display() {
        System.out.println("Showing country details");
        System.out.println("Country: " + this.countryName + " | Language: " + this.spokenLanguage +
                " | Population: " + this.totalPopulation + " | States: " + this.totalStates);
        if (leader != null) {
            leader.display();
        } else {
            System.out.println("Leader reference is null");
        }
    }
}