package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Bonbon;

public class Confectioner {
    private Bonbon bonbon;

    public Confectioner(Bonbon bonbon) {
        System.out.println("Confectioner with Bonbon created");
        this.bonbon = bonbon;
    }

    public void craft() {
        System.out.println("Confectioner is using bonbon");
        if (bonbon != null) {
            this.bonbon.fill();
        }
    }
}