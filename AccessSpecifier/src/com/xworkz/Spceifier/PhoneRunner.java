package com.xworkz.Spceifier;

import com.xworkz.Spceifier.checker.Teenager;

public class PhoneRunner {
    public static void main(String ... args){
        Phone p1=new Phone();
        Teenager t1=new Teenager();
        t1.user();
        System.out.println(p1.storage);
        p1.powerOff();
    }

}
