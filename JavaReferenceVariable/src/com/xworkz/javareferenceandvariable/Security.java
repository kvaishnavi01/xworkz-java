package com.xworkz.javareferenceandvariable;

public class Security {
    String securityType;
    int guardCount;
    String threatLevel;
    boolean hasWeapons;
    Personnel guard = new Personnel("watchman", 456, "evening", false);

    Security(String securityType, int guardCount, String threatLevel, boolean hasWeapons) {
        this.securityType = securityType;
        this.guardCount = guardCount;
        this.threatLevel = threatLevel;
        this.hasWeapons = hasWeapons;
    }

    void display() {
        System.out.println("Showing security details");
        System.out.println("Type: " + this.securityType + " | Guards: " + this.guardCount +
                " | Level: " + this.threatLevel + " | Armed: " + this.hasWeapons);
        if (guard != null) {
            guard.display();
        }
    }
}