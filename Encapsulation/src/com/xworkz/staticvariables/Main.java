package com.xworkz.staticvariables;

public class Main {
    public static void main(String[] args) {
        Website user1 = new Website();
        Website user2 = new Website();
        System.out.println(Website.getActiveUsers());
        user1.logout();
        System.out.println(Website.getActiveUsers());
        user2.logout();
        System.out.println(Website.getActiveUsers());
    }
}

