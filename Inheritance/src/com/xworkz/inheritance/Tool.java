package com.xworkz.inheritance;

public class Tool {
    public Tool() {
        System.out.println("no args const of Tool");
    }

    public void use() {
        System.out.println("Tool is used for a specific task");
    }

    public void maintain() {
        System.out.println("Tool needs maintenance");
    }

    public void store() {
        System.out.println("Tool must be stored properly");
    }

    public void identify() {
        System.out.println("Tool is identified by its shape and purpose");
    }

    public void safetyCheck() {
        System.out.println("Tool should pass safety checks before use");
    }
}
