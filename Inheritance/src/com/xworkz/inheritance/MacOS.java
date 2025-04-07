package com.xworkz.inheritance;

public class MacOS {
    public void start(OperatingSystem operatingSystem){
        operatingSystem.boot();
        operatingSystem.displayInfo();
        operatingSystem.runApplication();
        operatingSystem.update();
        operatingSystem.shutdown();

        if(operatingSystem instanceof LinuxOS){
            LinuxOS linuxOS=(LinuxOS) operatingSystem;
            linuxOS.start();
        }
    }
}
