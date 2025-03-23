package com.xworkz.javareferenceandvariable;

public class Minister {
    String fullName;
    String ministry;
    int yearsOld;
    int yearsInService;
    PersonalAssistant assistant = new PersonalAssistant("Rita", "organization", 32, 6);
    Security protection = new Security("federal", 25, "top", true);
    Portfolio[] duties = new Portfolio[]{
            new Portfolio("trade", 102, "global relations", 40),
            new Portfolio("economy", 104, "national budget", 90)
    };
    House residence = new House("Mysore", 5, 8, true);
    State[] regions = new State[]{
            new State("Tamil Nadu", "Chennai", 10, 15),
            new State("Gujarat", "Gandhinagar", 12, 30)
    };

    Minister(String fullName, String ministry, int yearsOld, int yearsInService) {
        this.fullName = fullName;
        this.ministry = ministry;
        this.yearsOld = yearsOld;
        this.yearsInService = yearsInService;
        System.out.println("Name: " + this.fullName + " | Ministry: " + this.ministry +
                " | Age: " + this.yearsOld + " | Service: " + this.yearsInService);
    }

    void display() {
        System.out.println("Showing minister details");
        if (assistant != null && protection != null && duties != null && residence != null && regions != null) {
            assistant.display();
            protection.display();
            for (Portfolio task : duties) {
                task.display();
            }
            residence.display();
            for (State region : regions) {
                region.display();
            }
        }
    }
}