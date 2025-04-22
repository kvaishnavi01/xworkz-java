package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Candy;

public class SweetShop {
    private Candy candy;

    public SweetShop(Candy candy) {
        System.out.println("SweetShop with Candy created");
        this.candy = candy;
    }

    public void pack() {
        System.out.println("SweetShop is using candy");
        if (candy != null) {
            this.candy.wrap();
        }
    }
}