package com.xworkz.abstractclass;

import com.xworkz.abstractclass.Student;

class CollegeStudent extends Student {
    CollegeStudent(String name, int age, String course) {
        super(name, age, course);
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}
