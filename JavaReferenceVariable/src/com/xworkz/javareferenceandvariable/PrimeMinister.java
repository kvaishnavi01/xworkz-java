package com.xworkz.javareferenceandvariable;

public class PrimeMinister {
    String leaderName;
    String nation;
    long termBegin;
    long termEnd;
    Minister[] cabinet = new Minister[]{
            new Minister("Suresh", "external", 55, 12),
            new Minister("Priya", "treasury", 42, 8),
            new Minister("Vikram", "defense", 70, 18)
    };

    PrimeMinister(String leaderName, String nation, long termBegin, long termEnd) {
        this.leaderName = leaderName;
        this.nation = nation;
        this.termBegin = termBegin;
        this.termEnd = termEnd;
    }

    void display() {
        System.out.println("Showing prime minister details");
        System.out.println("Leader: " + this.leaderName + " | Nation: " + this.nation +
                " | Term Start: " + this.termBegin + " | Term End: " + this.termEnd);
        if (cabinet != null) {
            for (Minister member : cabinet) {
                member.display();
            }
        }
    }
}