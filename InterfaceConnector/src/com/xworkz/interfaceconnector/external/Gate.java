package com.xworkz.interfaceconnector.external;


import com.xworkz.interfaceconnector.internal.Lock;

public class Gate {
    private Lock lock;

    public Gate(Lock lock) {
        System.out.println("Gate with Lock created");
        this.lock = lock;
    }

    public void protect() {
        System.out.println("Gate is using lock");
        if (lock != null) {
            this.lock.secure();
        }
    }
}