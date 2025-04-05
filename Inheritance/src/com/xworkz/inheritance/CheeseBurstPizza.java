package com.xworkz.inheritance;

public class CheeseBurstPizza extends Pizza {
    public CheeseBurstPizza() {
        System.out.println("no args const of CheeseBurstPizza");
    }

    @Override
    public void bake() {
        System.out.println("CheeseBurstPizza bakes extra cheesy");
    }

    @Override
    public void slice() {
        System.out.println("CheeseBurstPizza slices with cheese pull");
    }

    @Override
    public void box() {
        System.out.println("CheeseBurstPizza gets special box");
    }

    @Override
    public void deliver() {
        System.out.println("CheeseBurstPizza delivered with dip");
    }

    @Override
    public void eat() {
        System.out.println("CheeseBurstPizza eaten with joy");
    }
}