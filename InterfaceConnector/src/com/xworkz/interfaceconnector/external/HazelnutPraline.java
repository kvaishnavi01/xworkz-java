package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Praline;

public class HazelnutPraline implements Praline {
    public HazelnutPraline() {
        System.out.println("HazelnutPraline created");
    }

    @Override
    public void coat() {
        System.out.println("Coating HazelnutPraline");
    }
}