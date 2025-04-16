package com.xworkz.interfaces;

public class LipstickManager implements Lipstick, BankManager {
    public void applyLipstick() {
        System.out.println("Applies glossy lipstick.");
    }
    public void removeLipstick() {
        System.out.println("Removes lipstick with cleanser.");
    }
    public void chooseShade() {
        System.out.println("Chooses matching lipstick shade.");
    }

    public void approveLoan() {
        System.out.println("Approves loan applications.");
    }
    public void manageAccounts() {
        System.out.println("Manages customer accounts.");
    }
    public void meetCustomers() {
        System.out.println("Meets customers for queries.");
    }

    @Override
    public void twistOpen() {

    }

    @Override
    public void applyOnLips() {

    }

    @Override
    public void sealColor() {

    }
}
