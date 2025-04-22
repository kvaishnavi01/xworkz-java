package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Connector;

public class ConnectorUser {
    private Connector connector;

    public ConnectorUser(Connector connector){
        System.out.println("constr with interface as param");
        this.connector=connector;
    }

    public void execute(){
        System.out.println("running execute in ConnectorUser");
        if(connector!=null){
            this.connector.run();
        }
    }
}
