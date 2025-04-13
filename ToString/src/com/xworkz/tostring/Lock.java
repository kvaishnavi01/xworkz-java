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

    @Override
    public int hashCode() {
        return 64;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Lock) {
                System.out.println("will compare.....");
                Lock l1 = this;
                Lock l2 = (Lock) obj;
                if (l1.type.equals(l2.type) && l1.digits == l2.digits && l1.grade == l2.grade) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
