package com.xworkz.javareferenceandvariable;

public class Skill {
    String abilityName;
    int skillRating;
    String field;
    int expYears;

    Skill(String abilityName, int skillRating, String field, int expYears) {
        this.abilityName = abilityName;
        this.skillRating = skillRating;
        this.field = field;
        this.expYears = expYears;
        System.out.println(this.abilityName + " " + this.skillRating + " " + this.field + " " + this.expYears);
    }

    void display() {
        System.out.println("Showing skill details");
    }
}