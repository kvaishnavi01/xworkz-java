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
    public int hashCode() {
        return 55;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Pet) {
                System.out.println("will compare.....");
                Pet p1 = this;
                Pet p2 = (Pet) obj;
                if(p1.name.equals(p2.name) && p1.isVaccinated == p2.isVaccinated) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
