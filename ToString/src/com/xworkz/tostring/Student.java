package com.xworkz.tostring;

public class Student {
    private String name;
    private int rollNumber;
    private double percentage;

    public Student(String name, int rollNumber, double percentage) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " roll number is " + this.rollNumber + " percentage is " + this.percentage;
    }

    @Override
    public int hashCode() {
        return 56;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Student) {
                System.out.println("will compare.....");
                Student s1 = this;
                Student s2 = (Student) obj;
                if(s1.name.equals(s2.name) && s1.rollNumber == s2.rollNumber) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
