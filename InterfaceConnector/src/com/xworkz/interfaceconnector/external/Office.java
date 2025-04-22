package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Chair;

public class Office {
    private Chair chair;

    public Office(Chair chair) {
        System.out.println("Office with Chair created");
        this.chair = chair;
    }

    public void work() {
        System.out.println("Office is using chair");
        if (chair != null) {
            this.chair.sit();
        }
    }
}