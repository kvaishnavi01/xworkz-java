package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Pen;

public class Student {
    private Pen pen;

    public Student(Pen pen) {
        System.out.println("Student with Pen created");
        this.pen = pen;
    }

    public void study() {
        System.out.println("Student is using pen");
        if (pen != null) {
            this.pen.write();
        }
    }
}