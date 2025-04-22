package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Connector;

public class ConnectorImp implements Connector {
    public ConnectorImp(){
        System.out.println("No-args constr of ConnectorImp");
    }
    @Override
    public void run() {
        System.out.println("running run in connector");
    }
}
