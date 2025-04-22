package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Phone;

public class Person {
    private Phone phone;

    public Person(Phone phone) {
        System.out.println("Person with Phone created");
        this.phone = phone;
    }

    public void communicate() {
        System.out.println("Person is using phone");
        if (phone != null) {
            this.phone.call();
        }
    }
}