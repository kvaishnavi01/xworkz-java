package com.xworkz.tostring;

public class Lock {
    private String type;
    private byte digits;
    private char grade;

    public Lock(String type, byte digits, char grade) {
        this.type = type;
        this.digits = digits;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " digits are " + this.digits + " grade is " + this.grade;
    }
}
