package com.xworkz.inheritance;

public class LinuxOS extends OperatingSystem {
    public LinuxOS() {
        System.out.println("no args const of LinuxOS");
    }

    @Override
    public void boot() {
        System.out.println("Linux OS is booting with GRUB");
    }

    @Override
    public void shutdown() {
        System.out.println("Linux OS is shutting down gracefully");
    }

    @Override
    public void runApplication() {
        System.out.println("Linux OS is executing via terminal");
    }

    @Override
    public void update() {
        System.out.println("Linux OS is updating using apt");
    }

    @Override
    public void displayInfo() {
        System.out.println("Linux OS: Ubuntu 22.04 LTS");
    }
}
