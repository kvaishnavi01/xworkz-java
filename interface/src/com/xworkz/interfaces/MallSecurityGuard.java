package com.xworkz.interfaces;

public class MallSecurityGuard implements SecurityGuard {
    public void patrolArea() {
        System.out.println("Patrols the mall area.");
    }
    public void monitorCCTV() {
        System.out.println("Monitors CCTV footage.");
    }
    public void checkID() {
        System.out.println("Checks IDs of mall visitors.");
    }
}
