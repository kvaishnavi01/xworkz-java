package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Toffee;

public class SweetVendor {
    private Toffee toffee;

    public SweetVendor(Toffee toffee) {
        System.out.println("SweetVendor with Toffee created");
        this.toffee = toffee;
    }

    public void distribute() {
        System.out.println("SweetVendor is using toffee");
        if (toffee != null) {
            this.toffee.chew();
        }
    }
}