package com.xworkz.javareferenceandvariable;

public class Personnel {
    String jobRole;
    int employeeId;
    String workShift;
    boolean trained;
    Skill ability = new Skill("basic", 7, "combat", 4);

    Personnel(String jobRole, int employeeId, String workShift, boolean trained) {
        this.jobRole = jobRole;
        this.employeeId = employeeId;
        this.workShift = workShift;
        this.trained = trained;
        System.out.println(this.jobRole + " " + this.employeeId + " " + this.workShift + " " + this.trained);
    }

    void display() {
        System.out.println("Showing personnel details");
        if (ability != null) {
            ability.display();
        }
    }
}