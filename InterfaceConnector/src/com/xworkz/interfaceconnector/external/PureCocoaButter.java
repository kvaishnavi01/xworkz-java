package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.CocoaButter;

public class PureCocoaButter implements CocoaButter {
    public PureCocoaButter() {
        System.out.println("PureCocoaButter created");
    }

    @Override
    public void melt() {
        System.out.println("Melting PureCocoaButter");
    }
}