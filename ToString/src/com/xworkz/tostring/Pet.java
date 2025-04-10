package com.xworkz.tostring;

public class Pet {
    private String name;
    private int age;
    private boolean isVaccinated;

    public Pet(String name, int age, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " age is " + this.age + " vaccinated is " + this.isVaccinated;
    }
    @Override
    public int hashCode(){
        return 55;
    }
}
