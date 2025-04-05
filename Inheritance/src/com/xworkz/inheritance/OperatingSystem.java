package com.xworkz.inheritance;

public class OperatingSystem {
    public OperatingSystem() {
        System.out.println("no args const of OperatingSystem");
    }

    public void boot() {
        System.out.println("Operating System is booting");
    }

    public void shutdown() {
        System.out.println("Operating System is shutting down");
    }

    public void runApplication() {
        System.out.println("Operating System is running an application");
    }

    public void update() {
        System.out.println("Operating System is updating");
    }

    public void displayInfo() {
        System.out.println("Operating System information displayed");
    }
}
